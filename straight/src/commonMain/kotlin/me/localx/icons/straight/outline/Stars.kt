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

public val Icons.Outline.Stars: ImageVector
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
                lineTo(0.0f, 10.0f)
                lineTo(7.946f, 10.0f)
                lineToRelative(2.162f, -7.0f)
                horizontalLineToRelative(1.784f)
                lineToRelative(2.162f, 7.0f)
                lineTo(22.0f, 10.0f)
                verticalLineToRelative(1.724f)
                lineToRelative(-6.056f, 4.119f)
                lineToRelative(2.438f, 7.175f)
                lineToRelative(-1.391f, 0.961f)
                lineTo(11.0f, 19.348f)
                close()
                moveTo(11.0f, 16.82f)
                lineToRelative(4.291f, 3.318f)
                lineToRelative(-1.729f, -5.092f)
                lineTo(18.038f, 12.0f)
                horizontalLineToRelative(-5.46f)
                lineTo(11.0f, 6.89f)
                lineTo(9.422f, 12.0f)
                lineTo(4.028f, 12.0f)
                lineToRelative(4.4f, 2.915f)
                lineTo(6.71f, 20.137f)
                close()
                moveTo(17.827f, 7.926f)
                lineTo(17.346f, 7.564f)
                lineTo(18.215f, 4.847f)
                lineTo(16.0f, 3.615f)
                lineTo(16.0f, 3.0f)
                horizontalLineToRelative(2.9f)
                lineToRelative(0.785f, -3.0f)
                horizontalLineToRelative(0.647f)
                lineToRelative(0.784f, 3.0f)
                lineTo(24.0f, 3.0f)
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
