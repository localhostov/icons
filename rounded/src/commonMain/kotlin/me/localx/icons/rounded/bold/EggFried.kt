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

public val Icons.Bold.EggFried: ImageVector
    get() {
        if (_eggFried != null) {
            return _eggFried!!
        }
        _eggFried = Builder(name = "EggFried", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 5.0f)
                arcTo(4.5f, 4.5f, 0.0f, true, false, 14.0f, 9.5f)
                arcTo(4.505f, 4.505f, 0.0f, false, false, 9.5f, 5.0f)
                close()
                moveTo(9.5f, 11.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 11.0f, 9.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 9.5f, 11.0f)
                close()
                moveTo(19.353f, 5.107f)
                arcToRelative(1.659f, 1.659f, 0.0f, false, true, -0.874f, -0.611f)
                arcTo(10.009f, 10.009f, 0.0f, false, false, 9.636f, 0.01f)
                arcTo(10.221f, 10.221f, 0.0f, false, false, 0.0f, 10.38f)
                verticalLineToRelative(0.665f)
                arcTo(12.97f, 12.97f, 0.0f, false, false, 12.954f, 24.0f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, false, 8.0f, -6.267f)
                arcToRelative(1.883f, 1.883f, 0.0f, false, true, 0.61f, -1.028f)
                arcToRelative(6.747f, 6.747f, 0.0f, false, false, -2.216f, -11.6f)
                close()
                moveTo(19.653f, 14.399f)
                arcToRelative(4.894f, 4.894f, 0.0f, false, false, -1.616f, 2.674f)
                arcTo(5.386f, 5.386f, 0.0f, false, true, 12.954f, 21.0f)
                arcTo(9.966f, 9.966f, 0.0f, false, true, 3.0f, 11.045f)
                lineTo(3.0f, 10.38f)
                arcTo(7.317f, 7.317f, 0.0f, false, true, 9.769f, 3.007f)
                curveTo(9.877f, 3.0f, 9.984f, 3.0f, 10.092f, 3.0f)
                arcToRelative(7.039f, 7.039f, 0.0f, false, true, 5.891f, 3.162f)
                arcToRelative(4.6f, 4.6f, 0.0f, false, false, 2.434f, 1.8f)
                horizontalLineToRelative(0.0f)
                arcTo(3.746f, 3.746f, 0.0f, false, true, 19.649f, 14.4f)
                close()
                moveTo(19.0f, 11.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 17.5f, 10.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 19.0f, 11.5f)
                close()
                moveTo(16.0f, 16.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 14.5f, 15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 16.0f, 16.5f)
                close()
            }
        }
        .build()
        return _eggFried!!
    }

private var _eggFried: ImageVector? = null
