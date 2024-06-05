package me.localx.icons.straight.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Outline.CloudShare: ImageVector
    get() {
        if (_cloudShare != null) {
            return _cloudShare!!
        }
        _cloudShare = Builder(name = "CloudShare", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.0f, 17.0f)
                arcToRelative(2.986f, 2.986f, 0.0f, false, false, -2.077f, 0.844f)
                lineToRelative(-2.96f, -1.481f)
                arcToRelative(2.9f, 2.9f, 0.0f, false, false, 0.037f, -0.363f)
                arcToRelative(2.9f, 2.9f, 0.0f, false, false, -0.037f, -0.363f)
                lineToRelative(2.96f, -1.481f)
                arcToRelative(2.994f, 2.994f, 0.0f, true, false, -0.923f, -2.156f)
                arcToRelative(2.9f, 2.9f, 0.0f, false, false, 0.037f, 0.363f)
                lineToRelative(-2.96f, 1.481f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 0.0f, 4.312f)
                lineToRelative(2.96f, 1.481f)
                arcToRelative(2.9f, 2.9f, 0.0f, false, false, -0.037f, 0.363f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 3.0f, -3.0f)
                close()
                moveTo(21.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
                moveTo(13.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                close()
                moveTo(21.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.0f, 21.0f)
                horizontalLineToRelative(-10.5f)
                arcToRelative(3.491f, 3.491f, 0.0f, false, true, -0.872f, -6.874f)
                lineToRelative(1.438f, -0.371f)
                lineToRelative(-0.884f, -1.192f)
                arcToRelative(5.945f, 5.945f, 0.0f, false, true, -1.182f, -3.563f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 11.94f, -0.8f)
                lineToRelative(0.1f, 0.736f)
                lineToRelative(1.748f, -1.748f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -15.788f, 1.812f)
                arcToRelative(7.912f, 7.912f, 0.0f, false, false, 0.9f, 3.671f)
                arcToRelative(5.49f, 5.49f, 0.0f, false, false, 2.6f, 10.329f)
                horizontalLineToRelative(10.5f)
                arcToRelative(7.986f, 7.986f, 0.0f, false, false, 0.972f, -0.065f)
                arcToRelative(4.946f, 4.946f, 0.0f, false, true, -0.872f, -1.935f)
                curveToRelative(-0.033f, 0.0f, -0.066f, 0.0f, -0.1f, 0.0f)
                close()
            }
        }
        .build()
        return _cloudShare!!
    }

private var _cloudShare: ImageVector? = null
