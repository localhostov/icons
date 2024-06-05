package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.FilterSlash: ImageVector
    get() {
        if (_filterSlash != null) {
            return _filterSlash!!
        }
        _filterSlash = Builder(name = "FilterSlash", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.246f, 15.025f)
                lineToRelative(4.754f, -4.918f)
                lineTo(22.0f, 5.5f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(5.0f, 2.0f)
                curveToRelative(-0.238f, 0.0f, -0.473f, 0.028f, -0.703f, 0.075f)
                lineTo(2.123f, -0.099f)
                lineTo(0.002f, 2.022f)
                lineTo(21.877f, 23.897f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(-6.752f, -6.752f)
                close()
                moveTo(18.5f, 5.0f)
                curveToRelative(0.276f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                verticalLineToRelative(3.394f)
                lineToRelative(-3.875f, 4.009f)
                lineTo(7.222f, 5.0f)
                horizontalLineToRelative(11.278f)
                close()
                moveTo(2.002f, 6.851f)
                lineToRelative(12.998f, 12.998f)
                verticalLineToRelative(4.05f)
                lineToRelative(-6.0f, -4.5f)
                verticalLineToRelative(-2.118f)
                lineTo(2.009f, 10.119f)
                lineToRelative(-0.007f, -3.268f)
                close()
            }
        }
        .build()
        return _filterSlash!!
    }

private var _filterSlash: ImageVector? = null
