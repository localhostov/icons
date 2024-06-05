package me.localx.icons.rounded.bold

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

public val Icons.Bold.Floor: ImageVector
    get() {
        if (_floor != null) {
            return _floor!!
        }
        _floor = Builder(name = "Floor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(1.362f, 10.99f)
                lineToRelative(7.83f, 5.174f)
                curveToRelative(0.84f, 0.555f, 1.824f, 0.833f, 2.809f, 0.833f)
                reflectiveCurveToRelative(1.969f, -0.277f, 2.809f, -0.833f)
                lineToRelative(7.829f, -5.174f)
                curveToRelative(0.853f, -0.564f, 1.362f, -1.495f, 1.362f, -2.49f)
                reflectiveCurveToRelative(-0.51f, -1.926f, -1.362f, -2.49f)
                lineTo(14.809f, 0.836f)
                curveToRelative(-1.68f, -1.11f, -3.938f, -1.11f, -5.617f, 0.0f)
                lineTo(1.361f, 6.01f)
                curveToRelative(-0.852f, 0.563f, -1.361f, 1.495f, -1.361f, 2.49f)
                reflectiveCurveToRelative(0.509f, 1.926f, 1.362f, 2.49f)
                close()
                moveTo(13.154f, 13.661f)
                curveToRelative(-0.68f, 0.449f, -1.629f, 0.449f, -2.309f, 0.0f)
                lineToRelative(-2.489f, -1.637f)
                lineToRelative(4.83f, -3.172f)
                lineToRelative(3.633f, 2.386f)
                lineToRelative(-3.665f, 2.422f)
                close()
                moveTo(18.635f, 10.039f)
                lineToRelative(-3.628f, -2.383f)
                lineToRelative(2.357f, -1.548f)
                lineToRelative(3.618f, 2.379f)
                lineToRelative(-2.348f, 1.551f)
                close()
                moveTo(10.845f, 3.339f)
                curveToRelative(0.34f, -0.225f, 0.747f, -0.337f, 1.154f, -0.337f)
                reflectiveCurveToRelative(0.814f, 0.112f, 1.154f, 0.337f)
                lineToRelative(2.39f, 1.572f)
                lineToRelative(-4.886f, 3.209f)
                lineToRelative(-3.535f, -2.322f)
                lineToRelative(3.722f, -2.459f)
                close()
                moveTo(5.307f, 6.998f)
                lineToRelative(3.529f, 2.318f)
                lineToRelative(-2.301f, 1.511f)
                lineToRelative(-3.52f, -2.315f)
                lineToRelative(2.292f, -1.515f)
                close()
                moveTo(23.75f, 14.456f)
                curveToRelative(0.457f, 0.691f, 0.268f, 1.622f, -0.424f, 2.079f)
                lineToRelative(-8.519f, 5.629f)
                curveToRelative(-0.84f, 0.555f, -1.824f, 0.833f, -2.809f, 0.833f)
                reflectiveCurveToRelative(-1.968f, -0.277f, -2.809f, -0.833f)
                lineTo(0.673f, 16.535f)
                curveToRelative(-0.691f, -0.457f, -0.881f, -1.387f, -0.424f, -2.079f)
                curveToRelative(0.456f, -0.691f, 1.385f, -0.882f, 2.079f, -0.424f)
                lineToRelative(8.519f, 5.629f)
                curveToRelative(0.68f, 0.449f, 1.629f, 0.449f, 2.309f, 0.0f)
                lineToRelative(8.519f, -5.629f)
                curveToRelative(0.69f, -0.456f, 1.621f, -0.268f, 2.078f, 0.424f)
                close()
            }
        }
        .build()
        return _floor!!
    }

private var _floor: ImageVector? = null
