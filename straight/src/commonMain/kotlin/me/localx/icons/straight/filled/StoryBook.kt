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

public val Icons.Filled.StoryBook: ImageVector
    get() {
        if (_storyBook != null) {
            return _storyBook!!
        }
        _storyBook = Builder(name = "StoryBook", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 19.0f)
                verticalLineToRelative(5.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(2.778f, 0.0f, 4.242f, 1.334f, 4.944f, 2.748f)
                curveToRelative(0.702f, -1.414f, 2.166f, -2.748f, 4.944f, -2.748f)
                horizontalLineToRelative(7.111f)
                close()
                moveTo(22.226f, 2.774f)
                lineToRelative(-0.518f, -1.774f)
                horizontalLineToRelative(-0.404f)
                lineToRelative(-0.525f, 1.773f)
                lineToRelative(-1.778f, 0.519f)
                verticalLineToRelative(0.404f)
                lineToRelative(1.777f, 0.526f)
                lineToRelative(0.526f, 1.777f)
                horizontalLineToRelative(0.404f)
                lineToRelative(0.519f, -1.778f)
                lineToRelative(1.773f, -0.525f)
                verticalLineToRelative(-0.404f)
                lineToRelative(-1.774f, -0.518f)
                close()
                moveTo(2.707f, 4.0f)
                horizontalLineToRelative(-0.404f)
                lineToRelative(-0.525f, 1.773f)
                lineToRelative(-1.778f, 0.519f)
                verticalLineToRelative(0.404f)
                lineToRelative(1.777f, 0.526f)
                lineToRelative(0.526f, 1.777f)
                horizontalLineToRelative(0.404f)
                lineToRelative(0.519f, -1.778f)
                lineToRelative(1.773f, -0.525f)
                verticalLineToRelative(-0.404f)
                lineToRelative(-1.774f, -0.518f)
                lineToRelative(-0.518f, -1.774f)
                close()
                moveTo(11.707f, 12.0f)
                horizontalLineToRelative(-0.404f)
                lineToRelative(-0.525f, 1.773f)
                lineToRelative(-1.778f, 0.519f)
                verticalLineToRelative(0.404f)
                lineToRelative(1.777f, 0.526f)
                lineToRelative(0.526f, 1.777f)
                horizontalLineToRelative(0.404f)
                lineToRelative(0.519f, -1.778f)
                lineToRelative(1.773f, -0.525f)
                verticalLineToRelative(-0.404f)
                lineToRelative(-1.774f, -0.518f)
                lineToRelative(-0.518f, -1.774f)
                close()
                moveTo(16.425f, 5.39f)
                lineToRelative(0.01f, -0.762f)
                lineToRelative(-3.371f, -1.062f)
                lineToRelative(0.313f, -3.162f)
                lineToRelative(-0.62f, -0.446f)
                lineToRelative(-2.104f, 2.927f)
                lineToRelative(-3.617f, -1.393f)
                lineToRelative(-0.472f, 0.657f)
                lineToRelative(2.472f, 2.985f)
                lineToRelative(-2.116f, 2.944f)
                lineToRelative(0.624f, 0.449f)
                lineToRelative(2.866f, -1.349f)
                lineToRelative(2.124f, 2.864f)
                lineToRelative(0.718f, -0.224f)
                lineToRelative(-0.076f, -2.164f)
                lineToRelative(9.525f, 6.35f)
                lineToRelative(1.109f, -1.664f)
                lineToRelative(-9.486f, -6.325f)
                lineToRelative(2.1f, -0.625f)
                close()
            }
        }
        .build()
        return _storyBook!!
    }

private var _storyBook: ImageVector? = null
