package me.localx.icons.rounded.bold

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

public val Icons.Bold.FieldHockey: ImageVector
    get() {
        if (_fieldHockey != null) {
            return _fieldHockey!!
        }
        _fieldHockey = Builder(name = "FieldHockey", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.666f, 0.364f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.293f, 1.952f)
                lineTo(9.82f, 15.452f)
                arcToRelative(0.955f, 0.955f, 0.0f, false, true, -1.345f, 0.426f)
                arcToRelative(1.065f, 1.065f, 0.0f, false, true, -0.336f, -1.324f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.786f, -5.46f)
                arcTo(4.07f, 4.07f, 0.0f, false, false, 0.706f, 11.583f)
                arcTo(8.941f, 8.941f, 0.0f, false, false, 12.072f, 23.444f)
                arcToRelative(8.857f, 8.857f, 0.0f, false, false, 5.0f, -4.614f)
                lineTo(23.655f, 5.624f)
                arcTo(4.015f, 4.015f, 0.0f, false, false, 21.666f, 0.364f)
                close()
                moveTo(14.366f, 17.536f)
                arcToRelative(5.962f, 5.962f, 0.0f, false, true, -7.889f, 2.931f)
                arcToRelative(5.994f, 5.994f, 0.0f, false, true, -3.006f, -7.719f)
                arcToRelative(1.192f, 1.192f, 0.0f, false, true, 1.008f, -0.756f)
                arcToRelative(1.273f, 1.273f, 0.0f, false, true, 0.868f, 0.55f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.029f, 0.842f)
                arcToRelative(4.034f, 4.034f, 0.0f, false, false, 1.6f, 5.095f)
                arcToRelative(3.973f, 3.973f, 0.0f, false, false, 3.178f, 0.339f)
                arcToRelative(3.933f, 3.933f, 0.0f, false, false, 2.368f, -2.071f)
                lineToRelative(2.342f, -4.7f)
                lineToRelative(1.8f, 0.872f)
                close()
                moveTo(20.942f, 4.346f)
                lineTo(18.005f, 10.237f)
                lineTo(16.205f, 9.366f)
                lineTo(19.085f, 3.6f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.561f, -0.53f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.3f, 1.281f)
                close()
                moveTo(24.0f, 21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -3.0f, -3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 24.0f, 21.0f)
                close()
            }
        }
        .build()
        return _fieldHockey!!
    }

private var _fieldHockey: ImageVector? = null
