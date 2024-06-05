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

public val Icons.Outline.HatBirthday: ImageVector
    get() {
        if (_hatBirthday != null) {
            return _hatBirthday!!
        }
        _hatBirthday = Builder(name = "HatBirthday", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.7f, 24.0f)
                lineTo(13.475f, 5.6f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, -2.95f, 0.0f)
                lineTo(0.3f, 24.0f)
                close()
                moveTo(10.4f, 22.0f)
                lineTo(8.235f, 22.0f)
                lineToRelative(6.036f, -10.853f)
                lineToRelative(1.138f, 2.047f)
                close()
                moveTo(16.543f, 15.24f)
                lineTo(17.678f, 17.284f)
                lineTo(14.986f, 22.0f)
                lineTo(12.7f, 22.0f)
                close()
                moveTo(5.946f, 22.0f)
                lineTo(3.7f, 22.0f)
                lineTo(12.0f, 7.059f)
                lineToRelative(1.127f, 2.029f)
                close()
                moveTo(17.289f, 22.0f)
                lineTo(18.816f, 19.327f)
                lineTo(20.3f, 22.0f)
                close()
            }
        }
        .build()
        return _hatBirthday!!
    }

private var _hatBirthday: ImageVector? = null
