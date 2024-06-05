package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.ParagraphLeft: ImageVector
    get() {
        if (_paragraphLeft != null) {
            return _paragraphLeft!!
        }
        _paragraphLeft = Builder(name = "ParagraphLeft", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.0f, 12.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.553f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                lineTo(15.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 0.553f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                lineTo(19.0f, 2.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-11.0f)
                curveTo(5.691f, 0.0f, 3.0f, 2.691f, 3.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                close()
                moveTo(23.0f, 19.0f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                lineTo(3.653f, 20.0f)
                lineToRelative(2.165f, 2.317f)
                curveToRelative(0.376f, 0.404f, 0.354f, 1.037f, -0.049f, 1.414f)
                curveToRelative(-0.193f, 0.18f, -0.438f, 0.269f, -0.683f, 0.269f)
                curveToRelative(-0.268f, 0.0f, -0.534f, -0.106f, -0.731f, -0.317f)
                lineToRelative(-2.414f, -2.586f)
                curveToRelative(-1.146f, -1.146f, -1.146f, -3.048f, 0.024f, -4.218f)
                lineToRelative(2.39f, -2.562f)
                curveToRelative(0.378f, -0.404f, 1.01f, -0.425f, 1.414f, -0.049f)
                curveToRelative(0.403f, 0.377f, 0.425f, 1.01f, 0.049f, 1.414f)
                lineToRelative(-2.163f, 2.317f)
                horizontalLineToRelative(18.346f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _paragraphLeft!!
    }

private var _paragraphLeft: ImageVector? = null
