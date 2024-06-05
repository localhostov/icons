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

public val Icons.Bold.EyeDropper: ImageVector
    get() {
        if (_eyeDropper != null) {
            return _eyeDropper!!
        }
        _eyeDropper = Builder(name = "EyeDropper", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.9f, 1.1f)
                arcToRelative(3.754f, 3.754f, 0.0f, false, false, -5.3f, 0.0f)
                lineToRelative(-2.488f, 2.484f)
                arcToRelative(3.452f, 3.452f, 0.0f, false, true, -4.836f, 0.071f)
                lineToRelative(-2.09f, 2.152f)
                lineToRelative(2.175f, 2.175f)
                lineToRelative(-8.189f, 8.189f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.854f, 4.39f)
                lineToRelative(-1.318f, 1.318f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(1.318f, -1.318f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.389f, -0.854f)
                lineToRelative(8.19f, -8.189f)
                lineToRelative(2.175f, 2.175f)
                lineToRelative(2.152f, -2.09f)
                arcToRelative(3.453f, 3.453f, 0.0f, false, true, 0.071f, -4.837f)
                lineToRelative(2.484f, -2.487f)
                arcToRelative(3.754f, 3.754f, 0.0f, false, false, 0.0f, -5.3f)
                close()
                moveTo(5.707f, 19.707f)
                arcToRelative(1.023f, 1.023f, 0.0f, false, true, -1.414f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -1.414f)
                lineToRelative(8.189f, -8.19f)
                lineToRelative(1.418f, 1.415f)
                close()
                moveTo(20.781f, 4.28f)
                lineTo(18.294f, 6.766f)
                arcToRelative(6.487f, 6.487f, 0.0f, false, false, -1.75f, 3.157f)
                lineToRelative(-2.467f, -2.467f)
                arcToRelative(6.487f, 6.487f, 0.0f, false, false, 3.157f, -1.75f)
                lineToRelative(2.486f, -2.487f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.061f, 1.061f)
                close()
            }
        }
        .build()
        return _eyeDropper!!
    }

private var _eyeDropper: ImageVector? = null
