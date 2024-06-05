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

public val Icons.Filled.Fingerprint: ImageVector
    get() {
        if (_fingerprint != null) {
            return _fingerprint!!
        }
        _fingerprint = Builder(name = "Fingerprint", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.486f, 22.143f)
                lineTo(5.457f, 20.428f)
                curveTo(9.0f, 18.3f, 9.0f, 13.73f, 9.0f, 11.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 6.0f, 0.0f)
                lineTo(13.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                curveTo(11.0f, 13.947f, 11.0f, 19.434f, 6.486f, 22.143f)
                close()
                moveTo(14.896f, 14.084f)
                lineTo(12.9f, 13.916f)
                curveToRelative(-0.316f, 3.729f, -1.525f, 6.615f, -3.592f, 8.58f)
                lineToRelative(1.377f, 1.449f)
                curveTo(13.123f, 21.634f, 14.538f, 18.315f, 14.9f, 14.084f)
                close()
                moveTo(17.642f, 20.339f)
                lineTo(15.761f, 19.661f)
                arcToRelative(15.57f, 15.57f, 0.0f, false, true, -1.6f, 3.235f)
                lineToRelative(1.674f, 1.094f)
                arcTo(17.538f, 17.538f, 0.0f, false, false, 17.642f, 20.339f)
                close()
                moveTo(19.0f, 11.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 6.787f, 6.333f)
                lineTo(8.276f, 7.667f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 17.0f, 11.0f)
                arcToRelative(29.686f, 29.686f, 0.0f, false, true, -0.462f, 5.809f)
                lineToRelative(1.963f, 0.382f)
                arcTo(31.459f, 31.459f, 0.0f, false, false, 19.0f, 11.0f)
                close()
                moveTo(7.0f, 11.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.069f, -0.833f)
                lineTo(5.1f, 9.833f)
                arcTo(6.971f, 6.971f, 0.0f, false, false, 5.0f, 11.0f)
                curveToRelative(0.0f, 4.645f, -1.346f, 7.0f, -4.0f, 7.0f)
                verticalLineToRelative(2.0f)
                curveTo(4.869f, 20.0f, 7.0f, 16.8f, 7.0f, 11.0f)
                close()
                moveTo(23.0f, 11.0f)
                arcToRelative(10.865f, 10.865f, 0.0f, false, false, -1.1f, -4.794f)
                lineToRelative(-1.8f, 0.875f)
                arcTo(8.9f, 8.9f, 0.0f, false, true, 21.0f, 11.0f)
                arcToRelative(27.569f, 27.569f, 0.0f, false, true, -2.274f, 11.921f)
                lineToRelative(1.8f, 0.861f)
                arcTo(29.414f, 29.414f, 0.0f, false, false, 23.0f, 11.0f)
                close()
                moveTo(3.0f, 11.0f)
                arcToRelative(9.01f, 9.01f, 0.0f, false, true, 9.0f, -9.0f)
                arcToRelative(8.911f, 8.911f, 0.0f, false, true, 5.4f, 1.8f)
                lineToRelative(1.2f, -1.6f)
                arcTo(10.9f, 10.9f, 0.0f, false, false, 12.0f, 0.0f)
                arcTo(11.013f, 11.013f, 0.0f, false, false, 1.0f, 11.0f)
                verticalLineToRelative(3.0f)
                lineTo(3.0f, 14.0f)
                close()
            }
        }
        .build()
        return _fingerprint!!
    }

private var _fingerprint: ImageVector? = null
