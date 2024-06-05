package me.localx.icons.rounded.outline

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

public val Icons.Outline.MagicWand: ImageVector
    get() {
        if (_magicWand != null) {
            return _magicWand!!
        }
        _magicWand = Builder(name = "MagicWand", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 9.064f)
                arcToRelative(3.049f, 3.049f, 0.0f, false, false, -0.9f, -2.164f)
                arcToRelative(3.139f, 3.139f, 0.0f, false, false, -4.334f, 0.0f)
                lineToRelative(-11.866f, 11.869f)
                arcToRelative(3.064f, 3.064f, 0.0f, false, false, 4.33f, 4.331f)
                lineToRelative(11.87f, -11.869f)
                arcToRelative(3.047f, 3.047f, 0.0f, false, false, 0.9f, -2.167f)
                close()
                moveTo(3.816f, 21.688f)
                arcToRelative(1.087f, 1.087f, 0.0f, false, true, -1.5f, 0.0f)
                arcToRelative(1.062f, 1.062f, 0.0f, false, true, 0.0f, -1.5f)
                lineToRelative(7.769f, -7.77f)
                lineToRelative(1.505f, 1.505f)
                close()
                moveTo(15.688f, 9.816f)
                lineTo(13.0f, 12.505f)
                lineTo(11.5f, 11.0f)
                lineTo(14.189f, 8.312f)
                arcToRelative(1.063f, 1.063f, 0.0f, true, true, 1.5f, 1.5f)
                close()
                moveTo(4.863f, 2.855f)
                lineTo(6.413f, 2.413f)
                lineTo(6.855f, 0.863f)
                arcToRelative(1.191f, 1.191f, 0.0f, false, true, 2.29f, 0.0f)
                lineToRelative(0.442f, 1.55f)
                lineToRelative(1.55f, 0.442f)
                arcToRelative(1.191f, 1.191f, 0.0f, false, true, 0.0f, 2.29f)
                lineToRelative(-1.55f, 0.442f)
                lineToRelative(-0.442f, 1.55f)
                arcToRelative(1.191f, 1.191f, 0.0f, false, true, -2.29f, 0.0f)
                lineToRelative(-0.442f, -1.55f)
                lineToRelative(-1.55f, -0.442f)
                arcToRelative(1.191f, 1.191f, 0.0f, false, true, 0.0f, -2.29f)
                close()
                moveTo(23.137f, 17.145f)
                lineTo(21.587f, 17.587f)
                lineTo(21.145f, 19.137f)
                arcToRelative(1.191f, 1.191f, 0.0f, false, true, -2.29f, 0.0f)
                lineToRelative(-0.442f, -1.55f)
                lineToRelative(-1.55f, -0.442f)
                arcToRelative(1.191f, 1.191f, 0.0f, false, true, 0.0f, -2.29f)
                lineToRelative(1.55f, -0.442f)
                lineToRelative(0.442f, -1.55f)
                arcToRelative(1.191f, 1.191f, 0.0f, false, true, 2.29f, 0.0f)
                lineToRelative(0.442f, 1.55f)
                lineToRelative(1.55f, 0.442f)
                arcToRelative(1.191f, 1.191f, 0.0f, false, true, 0.0f, 2.29f)
                close()
                moveTo(17.755f, 2.5f)
                lineTo(19.111f, 2.113f)
                lineTo(19.5f, 0.755f)
                arcToRelative(1.042f, 1.042f, 0.0f, false, true, 2.0f, 0.0f)
                lineToRelative(0.387f, 1.356f)
                lineToRelative(1.356f, 0.387f)
                arcToRelative(1.042f, 1.042f, 0.0f, false, true, 0.0f, 2.0f)
                lineToRelative(-1.356f, 0.387f)
                lineToRelative(-0.387f, 1.359f)
                arcToRelative(1.042f, 1.042f, 0.0f, false, true, -2.0f, 0.0f)
                lineToRelative(-0.387f, -1.355f)
                lineToRelative(-1.358f, -0.389f)
                arcToRelative(1.042f, 1.042f, 0.0f, false, true, 0.0f, -2.0f)
                close()
            }
        }
        .build()
        return _magicWand!!
    }

private var _magicWand: ImageVector? = null
