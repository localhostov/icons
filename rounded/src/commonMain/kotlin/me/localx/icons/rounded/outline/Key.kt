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

public val Icons.Outline.Key: ImageVector
    get() {
        if (_key != null) {
            return _key!!
        }
        _key = Builder(name = "Key", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.505f, 24.0f)
                arcTo(7.5f, 7.5f, 0.0f, false, true, 5.469f, 9.283f)
                arcTo(7.368f, 7.368f, 0.0f, false, true, 9.35f, 9.235f)
                lineToRelative(7.908f, -7.906f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 20.464f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcTo(3.539f, 3.539f, 0.0f, false, true, 24.0f, 3.536f)
                arcToRelative(4.508f, 4.508f, 0.0f, false, true, -1.328f, 3.207f)
                lineTo(22.0f, 7.415f)
                arcTo(2.014f, 2.014f, 0.0f, false, true, 20.586f, 8.0f)
                lineTo(19.0f, 8.0f)
                lineTo(19.0f, 9.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(16.0f, 11.0f)
                verticalLineToRelative(1.586f)
                arcTo(1.986f, 1.986f, 0.0f, false, true, 15.414f, 14.0f)
                lineToRelative(-0.65f, 0.65f)
                arcToRelative(7.334f, 7.334f, 0.0f, false, true, -0.047f, 3.88f)
                arcToRelative(7.529f, 7.529f, 0.0f, false, true, -6.428f, 5.429f)
                arcTo(7.654f, 7.654f, 0.0f, false, true, 7.505f, 24.0f)
                close()
                moveTo(7.505f, 11.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, 5.289f, 6.99f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, false, -0.1f, -3.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.238f, -1.035f)
                lineTo(14.0f, 12.586f)
                lineTo(14.0f, 11.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(1.0f)
                lineTo(17.0f, 8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(1.586f)
                lineToRelative(0.672f, -0.672f)
                arcTo(2.519f, 2.519f, 0.0f, false, false, 22.0f, 3.536f)
                arcTo(1.537f, 1.537f, 0.0f, false, false, 20.465f, 2.0f)
                arcToRelative(2.52f, 2.52f, 0.0f, false, false, -1.793f, 0.743f)
                lineToRelative(-8.331f, 8.33f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.036f, 0.237f)
                arcTo(5.462f, 5.462f, 0.0f, false, false, 7.5f, 11.0f)
                close()
                moveTo(5.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 5.0f, 18.0f)
                close()
            }
        }
        .build()
        return _key!!
    }

private var _key: ImageVector? = null
