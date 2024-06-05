package me.localx.icons.rounded.filled

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

public val Icons.Filled.HatBirthday: ImageVector
    get() {
        if (_hatBirthday != null) {
            return _hatBirthday!!
        }
        _hatBirthday = Builder(name = "HatBirthday", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.43f, 15.33f)
                lineTo(14.319f, 24.0f)
                lineTo(10.405f, 24.0f)
                lineToRelative(8.071f, -11.47f)
                close()
                moveTo(15.265f, 7.93f)
                lineTo(4.046f, 23.89f)
                arcTo(5.432f, 5.432f, 0.0f, false, false, 5.127f, 24.0f)
                lineTo(7.961f, 24.0f)
                lineToRelative(9.3f, -13.214f)
                close()
                moveTo(21.647f, 17.074f)
                lineTo(16.766f, 24.0f)
                horizontalLineToRelative(2.107f)
                arcTo(3.989f, 3.989f, 0.0f, false, false, 22.6f, 22.019f)
                arcToRelative(4.122f, 4.122f, 0.0f, false, false, -0.465f, -4.241f)
                close()
                moveTo(15.0f, 3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, -4.592f, 2.534f)
                lineTo(1.861f, 17.778f)
                arcTo(4.122f, 4.122f, 0.0f, false, false, 1.4f, 22.019f)
                arcToRelative(3.38f, 3.38f, 0.0f, false, false, 0.813f, 1.006f)
                lineTo(14.046f, 6.184f)
                lineToRelative(-0.454f, -0.65f)
                arcTo(2.989f, 2.989f, 0.0f, false, false, 15.0f, 3.0f)
                close()
            }
        }
        .build()
        return _hatBirthday!!
    }

private var _hatBirthday: ImageVector? = null
