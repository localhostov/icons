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

public val Icons.Bold.IndustryWindows: ImageVector
    get() {
        if (_industryWindows != null) {
            return _industryWindows!!
        }
        _industryWindows = Builder(name = "IndustryWindows", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 24.0f)
                lineTo(3.5f, 24.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(0.0f, 0.0f)
                lineTo(6.54f, 0.0f)
                lineToRelative(2.079f, 10.05f)
                lineToRelative(5.381f, -4.983f)
                verticalLineToRelative(4.433f)
                lineToRelative(5.0f, -4.235f)
                verticalLineToRelative(4.247f)
                lineToRelative(5.0f, -4.258f)
                verticalLineToRelative(15.247f)
                curveToRelative(0.0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                close()
                moveTo(3.0f, 3.0f)
                lineTo(3.0f, 20.5f)
                curveToRelative(0.0f, 0.275f, 0.225f, 0.5f, 0.5f, 0.5f)
                lineTo(20.5f, 21.0f)
                curveToRelative(0.275f, 0.0f, 0.5f, -0.225f, 0.5f, -0.5f)
                lineTo(21.0f, 11.747f)
                lineToRelative(-2.646f, 2.253f)
                horizontalLineToRelative(-2.354f)
                verticalLineToRelative(-2.264f)
                lineToRelative(-2.673f, 2.264f)
                horizontalLineToRelative(-2.327f)
                verticalLineToRelative(-2.066f)
                lineToRelative(-2.23f, 2.066f)
                horizontalLineToRelative(-2.396f)
                lineTo(4.097f, 3.0f)
                horizontalLineToRelative(-1.097f)
                close()
                moveTo(9.0f, 16.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(14.0f, 16.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(19.0f, 16.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _industryWindows!!
    }

private var _industryWindows: ImageVector? = null
