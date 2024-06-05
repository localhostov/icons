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

public val Icons.Outline.PenNib: ImageVector
    get() {
        if (_penNib != null) {
            return _penNib!!
        }
        _penNib = Builder(name = "PenNib", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.952f, 8.462f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-2.524f, 2.524f)
                lineToRelative(-5.586f, -5.586f)
                lineToRelative(2.524f, -2.524f)
                lineTo(15.538f, 0.048f)
                lineToRelative(-3.076f, 3.076f)
                lineToRelative(-8.283f, 3.074f)
                lineTo(0.01f, 23.99f)
                lineToRelative(17.792f, -4.169f)
                lineToRelative(3.074f, -8.283f)
                lineToRelative(3.076f, -3.076f)
                close()
                moveTo(16.3f, 18.119f)
                lineToRelative(-11.761f, 2.756f)
                lineToRelative(4.943f, -4.943f)
                curveToRelative(0.165f, 0.044f, 0.339f, 0.068f, 0.518f, 0.068f)
                curveToRelative(1.105f, 0.0f, 2.0f, -0.895f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.895f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.895f, -2.0f, 2.0f)
                curveToRelative(0.0f, 0.179f, 0.024f, 0.353f, 0.068f, 0.518f)
                lineToRelative(-4.943f, 4.943f)
                lineToRelative(2.756f, -11.761f)
                lineToRelative(6.879f, -2.553f)
                lineToRelative(6.093f, 6.093f)
                lineToRelative(-2.553f, 6.879f)
                close()
            }
        }
        .build()
        return _penNib!!
    }

private var _penNib: ImageVector? = null
