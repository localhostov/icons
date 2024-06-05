package me.localx.icons.straight.outline

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

public val Icons.Outline.Snap: ImageVector
    get() {
        if (_snap != null) {
            return _snap!!
        }
        _snap = Builder(name = "Snap", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.207f, 6.207f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(3.0f, -3.0f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-3.0f, 3.0f)
                close()
                moveTo(6.207f, 4.793f)
                lineTo(3.207f, 1.793f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(3.0f, 3.0f)
                lineToRelative(1.414f, -1.414f)
                close()
                moveTo(10.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                lineTo(10.0f, 0.0f)
                close()
                moveTo(20.331f, 18.445f)
                lineToRelative(-3.446f, -5.167f)
                lineToRelative(4.17f, -4.17f)
                curveToRelative(1.054f, -1.053f, 1.222f, -2.718f, 0.391f, -3.871f)
                curveToRelative(-0.511f, -0.71f, -1.3f, -1.158f, -2.163f, -1.228f)
                curveToRelative(-0.854f, -0.065f, -1.712f, 0.241f, -2.324f, 0.854f)
                lineToRelative(-7.933f, 7.933f)
                lineToRelative(-0.13f, -1.125f)
                curveToRelative(-0.026f, -0.787f, -0.357f, -1.516f, -0.933f, -2.053f)
                curveToRelative(-0.575f, -0.538f, -1.352f, -0.813f, -2.11f, -0.792f)
                curveToRelative(-1.625f, 0.055f, -2.904f, 1.421f, -2.852f, 3.013f)
                verticalLineToRelative(9.248f)
                reflectiveCurveTo(0.086f, 24.0f, 0.086f, 24.0f)
                horizontalLineToRelative(2.828f)
                lineToRelative(2.086f, -2.086f)
                verticalLineToRelative(-10.108f)
                curveToRelative(-0.017f, -0.523f, 0.396f, -0.964f, 0.919f, -0.981f)
                curveToRelative(0.273f, -0.013f, 0.494f, 0.082f, 0.679f, 0.254f)
                curveToRelative(0.185f, 0.173f, 0.291f, 0.407f, 0.306f, 0.739f)
                lineToRelative(0.604f, 5.324f)
                lineToRelative(10.864f, -10.864f)
                curveToRelative(0.197f, -0.197f, 0.483f, -0.299f, 0.748f, -0.274f)
                curveToRelative(0.282f, 0.022f, 0.532f, 0.166f, 0.702f, 0.402f)
                curveToRelative(0.26f, 0.36f, 0.18f, 0.926f, -0.182f, 1.288f)
                lineToRelative(-5.33f, 5.33f)
                lineToRelative(4.357f, 6.531f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.001f)
                lineToRelative(0.545f, 0.816f)
                lineToRelative(-3.627f, 3.627f)
                horizontalLineToRelative(2.829f)
                lineToRelative(3.373f, -3.373f)
                lineToRelative(-1.455f, -2.182f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
                close()
            }
        }
        .build()
        return _snap!!
    }

private var _snap: ImageVector? = null
