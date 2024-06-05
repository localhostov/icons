package me.localx.icons.rounded.outline

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

public val Icons.Outline.RotateSquare: ImageVector
    get() {
        if (_rotateSquare != null) {
            return _rotateSquare!!
        }
        _rotateSquare = Builder(name = "RotateSquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 0.0f)
                lineTo(5.0f, 0.0f)
                curveTo(2.243f, 0.0f, 0.0f, 2.243f, 0.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                lineTo(24.0f, 5.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(22.0f, 19.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                lineTo(5.0f, 22.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                lineTo(2.0f, 5.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(14.0f)
                close()
                moveTo(19.0f, 6.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.447f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(1.984f)
                curveToRelative(-0.934f, -1.235f, -2.399f, -2.0f, -3.984f, -2.0f)
                curveToRelative(-2.116f, 0.0f, -4.011f, 1.339f, -4.715f, 3.333f)
                curveToRelative(-0.146f, 0.411f, -0.531f, 0.667f, -0.943f, 0.667f)
                curveToRelative(-0.11f, 0.0f, -0.223f, -0.019f, -0.333f, -0.058f)
                curveToRelative(-0.521f, -0.184f, -0.794f, -0.755f, -0.61f, -1.276f)
                curveToRelative(0.986f, -2.792f, 3.64f, -4.667f, 6.602f, -4.667f)
                curveToRelative(1.913f, 0.0f, 3.702f, 0.801f, 5.0f, 2.127f)
                verticalLineToRelative(-1.127f)
                curveToRelative(0.0f, -0.552f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                close()
                moveTo(18.602f, 14.333f)
                curveToRelative(-0.986f, 2.792f, -3.64f, 4.667f, -6.602f, 4.667f)
                curveToRelative(-1.913f, 0.0f, -3.702f, -0.801f, -5.0f, -2.127f)
                verticalLineToRelative(1.127f)
                curveToRelative(0.0f, 0.552f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.447f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-1.984f)
                curveToRelative(0.934f, 1.235f, 2.399f, 2.0f, 3.984f, 2.0f)
                curveToRelative(2.116f, 0.0f, 4.011f, -1.339f, 4.715f, -3.333f)
                curveToRelative(0.185f, -0.521f, 0.755f, -0.794f, 1.276f, -0.61f)
                curveToRelative(0.521f, 0.184f, 0.794f, 0.755f, 0.61f, 1.276f)
                close()
            }
        }
        .build()
        return _rotateSquare!!
    }

private var _rotateSquare: ImageVector? = null
