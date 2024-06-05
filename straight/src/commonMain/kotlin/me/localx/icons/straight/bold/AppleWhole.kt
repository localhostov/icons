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

public val Icons.Bold.AppleWhole: ImageVector
    get() {
        if (_appleWhole != null) {
            return _appleWhole!!
        }
        _appleWhole = Builder(name = "AppleWhole", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.435f, 6.08f)
                arcToRelative(5.543f, 5.543f, 0.0f, false, false, 1.976f, -1.22f)
                curveToRelative(1.806f, -1.806f, 1.58f, -4.851f, 1.58f, -4.851f)
                reflectiveCurveToRelative(-3.045f, -0.226f, -4.851f, 1.58f)
                arcToRelative(7.082f, 7.082f, 0.0f, false, false, -1.7f, 4.158f)
                arcToRelative(15.77f, 15.77f, 0.0f, false, false, -1.7f, -5.729f)
                lineTo(9.081f, 1.408f)
                arcTo(12.7f, 12.7f, 0.0f, false, true, 10.451f, 6.0f)
                horizontalLineTo(8.659f)
                arcTo(8.845f, 8.845f, 0.0f, false, false, 0.0f, 15.0f)
                curveToRelative(-0.107f, 6.252f, 6.377f, 10.838f, 12.0f, 8.3f)
                curveToRelative(5.624f, 2.537f, 12.106f, -2.048f, 12.0f, -8.3f)
                arcTo(8.9f, 8.9f, 0.0f, false, false, 16.435f, 6.08f)
                close()
                moveTo(15.341f, 21.0f)
                arcToRelative(5.336f, 5.336f, 0.0f, false, true, -2.614f, -0.681f)
                lineToRelative(-0.727f, -0.4f)
                lineToRelative(-0.727f, 0.4f)
                curveTo(7.545f, 22.45f, 2.916f, 19.349f, 3.0f, 15.0f)
                arcTo(5.843f, 5.843f, 0.0f, false, true, 8.659f, 9.0f)
                horizontalLineToRelative(6.682f)
                curveTo(22.82f, 9.247f, 22.814f, 20.756f, 15.341f, 21.0f)
                close()
            }
        }
        .build()
        return _appleWhole!!
    }

private var _appleWhole: ImageVector? = null
