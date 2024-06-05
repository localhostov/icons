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

public val Icons.Filled.Racquet: ImageVector
    get() {
        if (_racquet != null) {
            return _racquet!!
        }
        _racquet = Builder(name = "Racquet", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.922f, 2.078f)
                arcTo(7.455f, 7.455f, 0.0f, false, false, 15.73f, 0.05f)
                arcTo(10.864f, 10.864f, 0.0f, false, false, 9.257f, 3.258f)
                arcTo(10.863f, 10.863f, 0.0f, false, false, 6.049f, 9.731f)
                arcToRelative(14.665f, 14.665f, 0.0f, false, false, -0.023f, 1.506f)
                arcToRelative(8.042f, 8.042f, 0.0f, false, false, 0.157f, 1.176f)
                curveToRelative(0.142f, 1.571f, 0.107f, 3.883f, -0.891f, 4.88f)
                lineToRelative(-5.25f, 5.25f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(5.25f, -5.25f)
                curveToRelative(1.006f, -1.0f, 3.344f, -1.032f, 4.915f, -0.887f)
                arcToRelative(16.4f, 16.4f, 0.0f, false, false, 1.7f, 0.182f)
                arcToRelative(8.987f, 8.987f, 0.0f, false, false, 0.949f, -0.051f)
                arcToRelative(10.869f, 10.869f, 0.0f, false, false, 6.474f, -3.208f)
                arcTo(10.875f, 10.875f, 0.0f, false, false, 23.95f, 8.27f)
                arcTo(7.451f, 7.451f, 0.0f, false, false, 21.922f, 2.078f)
                close()
                moveTo(21.961f, 8.061f)
                arcToRelative(7.949f, 7.949f, 0.0f, false, true, -0.555f, 2.171f)
                lineTo(19.923f, 8.749f)
                lineTo(21.968f, 6.7f)
                arcTo(6.7f, 6.7f, 0.0f, false, true, 21.961f, 8.061f)
                close()
                moveTo(21.3f, 4.544f)
                lineTo(18.509f, 7.335f)
                lineTo(16.583f, 5.409f)
                lineToRelative(2.753f, -2.753f)
                arcToRelative(4.87f, 4.87f, 0.0f, false, true, 1.172f, 0.836f)
                arcTo(4.831f, 4.831f, 0.0f, false, true, 21.3f, 4.544f)
                close()
                moveTo(9.49f, 14.51f)
                arcToRelative(4.868f, 4.868f, 0.0f, false, true, -0.847f, -1.16f)
                lineToRelative(2.991f, -2.991f)
                lineToRelative(1.925f, 1.926f)
                lineTo(10.543f, 15.3f)
                arcTo(4.889f, 4.889f, 0.0f, false, true, 9.49f, 14.51f)
                close()
                moveTo(8.732f, 7.457f)
                lineTo(10.22f, 8.945f)
                lineTo(8.038f, 11.126f)
                arcTo(6.92f, 6.92f, 0.0f, false, true, 8.732f, 7.457f)
                close()
                moveTo(13.048f, 8.945f)
                lineTo(15.169f, 6.823f)
                lineTo(17.1f, 8.749f)
                lineTo(14.973f, 10.87f)
                close()
                moveTo(15.938f, 2.039f)
                arcToRelative(4.6f, 4.6f, 0.0f, false, true, 1.187f, 0.0f)
                lineTo(15.169f, 4.0f)
                lineToRelative(-1.4f, -1.4f)
                arcTo(8.461f, 8.461f, 0.0f, false, true, 15.938f, 2.039f)
                close()
                moveTo(11.945f, 3.6f)
                lineToRelative(1.81f, 1.81f)
                lineTo(11.634f, 7.531f)
                lineTo(9.791f, 5.688f)
                arcTo(9.593f, 9.593f, 0.0f, false, true, 11.945f, 3.6f)
                close()
                moveTo(14.06f, 15.962f)
                arcToRelative(9.709f, 9.709f, 0.0f, false, true, -1.327f, -0.023f)
                lineToRelative(2.24f, -2.24f)
                lineToRelative(1.57f, 1.569f)
                arcTo(8.054f, 8.054f, 0.0f, false, true, 14.06f, 15.962f)
                close()
                moveTo(18.312f, 14.209f)
                lineTo(16.388f, 12.285f)
                lineTo(18.509f, 10.163f)
                lineTo(20.4f, 12.054f)
                arcToRelative(9.629f, 9.629f, 0.0f, false, true, -2.089f, 2.155f)
                close()
            }
        }
        .build()
        return _racquet!!
    }

private var _racquet: ImageVector? = null
