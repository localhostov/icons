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

public val Icons.Bold.CloudSun: ImageVector
    get() {
        if (_cloudSun != null) {
            return _cloudSun!!
        }
        _cloudSun = Builder(name = "CloudSun", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.63f, 13.574f)
                arcTo(5.487f, 5.487f, 0.0f, false, false, 9.006f, 15.255f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 10.5f, 24.0f)
                horizontalLineToRelative(8.25f)
                arcToRelative(5.25f, 5.25f, 0.0f, false, false, 0.88f, -10.426f)
                close()
                moveTo(18.75f, 21.0f)
                horizontalLineTo(10.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(15.5f)
                arcToRelative(2.488f, 2.488f, 0.0f, false, true, 4.958f, -0.312f)
                lineToRelative(0.166f, 1.312f)
                horizontalLineTo(18.75f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, 0.0f, 4.5f)
                close()
                moveTo(7.171f, 13.951f)
                lineTo(3.843f, 17.278f)
                lineTo(1.722f, 15.156f)
                lineTo(3.978f, 12.9f)
                arcToRelative(6.527f, 6.527f, 0.0f, false, true, -0.8f, -1.9f)
                horizontalLineTo(0.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(3.175f)
                arcToRelative(6.429f, 6.429f, 0.0f, false, true, 0.794f, -1.91f)
                lineTo(1.722f, 3.844f)
                lineTo(3.843f, 1.722f)
                lineTo(6.09f, 3.969f)
                arcTo(6.44f, 6.44f, 0.0f, false, true, 8.0f, 3.175f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(3.175f)
                arcToRelative(6.487f, 6.487f, 0.0f, false, true, 1.909f, 0.794f)
                lineToRelative(2.248f, -2.247f)
                lineToRelative(2.121f, 2.122f)
                lineTo(15.03f, 6.091f)
                arcToRelative(6.464f, 6.464f, 0.0f, false, true, 0.825f, 2.051f)
                arcTo(7.268f, 7.268f, 0.0f, false, false, 14.5f, 8.0f)
                arcToRelative(7.559f, 7.559f, 0.0f, false, false, -1.753f, 0.211f)
                arcToRelative(3.495f, 3.495f, 0.0f, true, false, -5.1f, 4.246f)
                arcTo(7.723f, 7.723f, 0.0f, false, false, 7.171f, 13.951f)
                close()
            }
        }
        .build()
        return _cloudSun!!
    }

private var _cloudSun: ImageVector? = null
