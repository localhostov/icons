package me.localx.icons.straight.filled

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

public val Icons.Filled.WindWarning: ImageVector
    get() {
        if (_windWarning != null) {
            return _windWarning!!
        }
        _windWarning = Builder(name = "WindWarning", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 20.0f)
                curveToRelative(-0.139f, 5.276f, -7.863f, 5.272f, -8.0f, 0.0f)
                lineTo(9.0f, 20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 2.0f, -2.0f)
                lineTo(0.0f, 18.0f)
                lineTo(0.0f, 16.0f)
                lineTo(11.0f, 16.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 15.0f, 20.0f)
                close()
                moveTo(0.0f, 7.0f)
                curveTo(0.294f, -2.251f, 13.707f, -2.249f, 14.0f, 7.0f)
                curveTo(13.706f, 16.251f, 0.293f, 16.249f, 0.0f, 7.0f)
                close()
                moveTo(6.0f, 8.0f)
                lineTo(8.0f, 8.0f)
                lineTo(8.0f, 3.0f)
                lineTo(6.0f, 3.0f)
                close()
                moveTo(6.0f, 11.0f)
                lineTo(8.0f, 11.0f)
                lineTo(8.0f, 9.0f)
                lineTo(6.0f, 9.0f)
                close()
                moveTo(20.0f, 9.0f)
                curveToRelative(5.275f, -0.139f, 5.273f, -7.862f, 0.0f, -8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 2.0f, 2.0f)
                lineTo(16.0f, 7.0f)
                arcToRelative(9.028f, 9.028f, 0.0f, false, true, -0.223f, 2.0f)
                close()
                moveTo(20.0f, 11.0f)
                lineTo(15.064f, 11.0f)
                arcToRelative(9.057f, 9.057f, 0.0f, false, true, -1.356f, 2.0f)
                lineTo(20.0f, 13.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -2.0f, 2.0f)
                lineTo(16.0f, 15.0f)
                curveToRelative(0.139f, 5.275f, 7.862f, 5.273f, 8.0f, 0.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 20.0f, 11.0f)
                close()
            }
        }
        .build()
        return _windWarning!!
    }

private var _windWarning: ImageVector? = null
