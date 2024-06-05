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

public val Icons.Bold.Trophy: ImageVector
    get() {
        if (_trophy != null) {
            return _trophy!!
        }
        _trophy = Builder(name = "Trophy", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 10.0f)
                arcToRelative(3.992f, 3.992f, 0.0f, false, false, -2.7f, -3.766f)
                arcToRelative(15.079f, 15.079f, 0.0f, false, false, 0.636f, -2.153f)
                arcTo(3.414f, 3.414f, 0.0f, false, false, 18.587f, 0.0f)
                lineTo(5.413f, 0.0f)
                arcTo(3.414f, 3.414f, 0.0f, false, false, 2.068f, 4.081f)
                arcTo(15.079f, 15.079f, 0.0f, false, false, 2.7f, 6.234f)
                arcTo(3.992f, 3.992f, 0.0f, false, false, 0.0f, 10.0f)
                curveToRelative(0.0f, 3.15f, 2.379f, 6.8f, 9.0f, 6.983f)
                verticalLineToRelative(2.654f)
                arcTo(1.218f, 1.218f, 0.0f, false, true, 7.667f, 21.0f)
                lineTo(6.0f, 21.0f)
                verticalLineToRelative(3.0f)
                lineTo(18.0f, 24.0f)
                lineTo(18.0f, 21.0f)
                lineTo(16.333f, 21.0f)
                arcTo(1.234f, 1.234f, 0.0f, false, true, 15.0f, 19.637f)
                lineTo(15.0f, 16.983f)
                curveTo(21.621f, 16.8f, 24.0f, 13.15f, 24.0f, 10.0f)
                close()
                moveTo(21.0f, 10.0f)
                curveToRelative(0.0f, 1.7f, -1.33f, 3.51f, -4.927f, 3.914f)
                curveToRelative(0.045f, -0.041f, 0.08f, -0.094f, 0.127f, -0.132f)
                arcToRelative(16.374f, 16.374f, 0.0f, false, false, 3.827f, -4.776f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 21.0f, 10.0f)
                close()
                moveTo(5.092f, 3.155f)
                arcTo(0.415f, 0.415f, 0.0f, false, true, 5.413f, 3.0f)
                lineTo(18.587f, 3.0f)
                arcToRelative(0.415f, 0.415f, 0.0f, false, true, 0.321f, 0.155f)
                arcToRelative(0.387f, 0.387f, 0.0f, false, true, 0.084f, 0.328f)
                arcToRelative(15.7f, 15.7f, 0.0f, false, true, -4.678f, 7.966f)
                arcTo(6.426f, 6.426f, 0.0f, false, false, 12.0f, 16.5f)
                arcToRelative(6.424f, 6.424f, 0.0f, false, false, -2.313f, -5.05f)
                arcTo(15.7f, 15.7f, 0.0f, false, true, 5.008f, 3.483f)
                arcTo(0.387f, 0.387f, 0.0f, false, true, 5.092f, 3.155f)
                close()
                moveTo(3.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.973f, -0.995f)
                arcTo(16.357f, 16.357f, 0.0f, false, false, 7.8f, 13.783f)
                curveToRelative(0.047f, 0.038f, 0.081f, 0.091f, 0.126f, 0.131f)
                curveTo(4.33f, 13.51f, 3.0f, 11.7f, 3.0f, 10.0f)
                close()
            }
        }
        .build()
        return _trophy!!
    }

private var _trophy: ImageVector? = null
