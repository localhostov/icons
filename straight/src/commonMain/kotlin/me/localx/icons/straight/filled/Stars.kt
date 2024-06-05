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

public val Icons.Filled.Stars: ImageVector
    get() {
        if (_stars != null) {
            return _stars!!
        }
        _stars = Builder(name = "Stars", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.982f, 24.0f)
                lineTo(3.66f, 23.0f)
                lineToRelative(2.394f, -7.261f)
                lineTo(0.0f, 11.731f)
                verticalLineTo(10.0f)
                horizontalLineTo(7.946f)
                lineToRelative(2.162f, -7.0f)
                horizontalLineToRelative(1.784f)
                lineToRelative(2.162f, 7.0f)
                horizontalLineTo(22.0f)
                verticalLineToRelative(1.724f)
                lineToRelative(-6.056f, 4.119f)
                lineToRelative(2.438f, 7.175f)
                lineToRelative(-1.391f, 0.961f)
                lineTo(11.0f, 19.348f)
                close()
                moveTo(17.827f, 7.926f)
                lineToRelative(-0.481f, -0.362f)
                lineToRelative(0.869f, -2.717f)
                lineTo(16.0f, 3.615f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(2.9f)
                lineToRelative(0.785f, -3.0f)
                horizontalLineToRelative(0.647f)
                lineToRelative(0.784f, 3.0f)
                horizontalLineTo(24.0f)
                verticalLineToRelative(0.611f)
                lineTo(21.8f, 4.884f)
                lineToRelative(0.884f, 2.686f)
                lineToRelative(-0.5f, 0.349f)
                lineTo(20.01f, 6.238f)
                close()
            }
        }
        .build()
        return _stars!!
    }

private var _stars: ImageVector? = null
