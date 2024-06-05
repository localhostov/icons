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

public val Icons.Bold.Stars: ImageVector
    get() {
        if (_stars != null) {
            return _stars!!
        }
        _stars = Builder(name = "Stars", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.286f, 24.043f)
                lineTo(3.368f, 22.589f)
                lineToRelative(2.256f, -6.508f)
                lineTo(0.0f, 12.509f)
                verticalLineTo(10.0f)
                horizontalLineTo(7.677f)
                lineTo(9.729f, 3.0f)
                horizontalLineTo(12.27f)
                lineToRelative(2.053f, 7.0f)
                horizontalLineTo(22.0f)
                verticalLineToRelative(2.5f)
                lineToRelative(-5.624f, 3.675f)
                lineToRelative(2.307f, 6.451f)
                lineToRelative(-2.007f, 1.391f)
                lineTo(11.0f, 19.626f)
                close()
                moveTo(6.369f, 13.0f)
                lineToRelative(2.867f, 1.821f)
                lineTo(8.111f, 18.067f)
                lineTo(11.0f, 15.833f)
                lineToRelative(2.859f, 2.211f)
                lineToRelative(-1.1f, -3.09f)
                lineTo(15.745f, 13.0f)
                horizontalLineTo(12.077f)
                lineTo(11.0f, 9.329f)
                lineTo(9.924f, 13.0f)
                close()
                moveTo(17.827f, 7.941f)
                lineToRelative(-0.481f, -0.362f)
                lineToRelative(0.869f, -2.717f)
                lineTo(16.0f, 3.631f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(2.9f)
                lineToRelative(0.785f, -3.0f)
                horizontalLineToRelative(0.647f)
                lineToRelative(0.784f, 3.0f)
                horizontalLineTo(24.0f)
                verticalLineToRelative(0.624f)
                lineTo(21.8f, 4.9f)
                lineToRelative(0.884f, 2.686f)
                lineToRelative(-0.5f, 0.349f)
                lineTo(20.01f, 6.254f)
                close()
            }
        }
        .build()
        return _stars!!
    }

private var _stars: ImageVector? = null
