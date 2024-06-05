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

public val Icons.Bold.Snowboarding: ImageVector
    get() {
        if (_snowboarding != null) {
            return _snowboarding!!
        }
        _snowboarding = Builder(name = "Snowboarding", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.148f, 20.234f)
                arcToRelative(1.343f, 1.343f, 0.0f, false, true, -0.769f, 0.69f)
                arcToRelative(1.379f, 1.379f, 0.0f, false, true, -1.077f, -0.077f)
                lineTo(17.0f, 19.834f)
                verticalLineTo(14.353f)
                lineToRelative(-3.831f, -3.612f)
                lineToRelative(1.5f, -2.054f)
                lineToRelative(7.007f, 4.569f)
                lineToRelative(1.638f, -2.512f)
                lineTo(11.446f, 3.0f)
                horizontalLineTo(7.619f)
                lineTo(4.674f, 0.066f)
                lineTo(2.557f, 2.191f)
                lineTo(6.381f, 6.0f)
                horizontalLineToRelative(4.173f)
                lineToRelative(0.086f, 0.056f)
                lineTo(8.725f, 8.547f)
                arcTo(3.515f, 3.515f, 0.0f, false, false, 8.0f, 10.68f)
                verticalLineToRelative(2.3f)
                lineTo(4.561f, 14.36f)
                lineToRelative(-0.777f, -0.341f)
                arcToRelative(1.353f, 1.353f, 0.0f, false, true, -0.658f, -1.795f)
                lineTo(0.4f, 10.962f)
                arcToRelative(4.364f, 4.364f, 0.0f, false, false, 2.146f, 5.79f)
                lineToRelative(15.5f, 6.82f)
                arcToRelative(4.351f, 4.351f, 0.0f, false, false, 5.805f, -2.041f)
                close()
                moveTo(11.0f, 15.016f)
                verticalLineToRelative(-2.2f)
                lineToRelative(3.0f, 2.827f)
                verticalLineToRelative(2.867f)
                lineTo(8.407f, 16.053f)
                close()
                moveTo(14.0f, 2.5f)
                arcTo(2.5f, 2.5f, 0.0f, true, true, 16.5f, 5.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 14.0f, 2.5f)
                close()
            }
        }
        .build()
        return _snowboarding!!
    }

private var _snowboarding: ImageVector? = null
