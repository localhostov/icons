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

public val Icons.Filled.FieldHockey: ImageVector
    get() {
        if (_fieldHockey != null) {
            return _fieldHockey!!
        }
        _fieldHockey = Builder(name = "FieldHockey", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.957f, 8.8f)
                lineTo(19.744f, 0.009f)
                lineTo(24.0f, 2.632f)
                lineTo(18.125f, 11.56f)
                close()
                moveTo(12.857f, 10.471f)
                lineTo(7.7f, 18.306f)
                arcToRelative(1.46f, 1.46f, 0.0f, true, true, -2.486f, -1.533f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 0.958f, 14.151f)
                arcToRelative(6.46f, 6.46f, 0.0f, false, false, 11.0f, 6.784f)
                lineToRelative(5.071f, -7.7f)
                close()
                moveTo(24.0f, 20.5f)
                arcTo(3.5f, 3.5f, 0.0f, true, false, 20.5f, 24.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 24.0f, 20.5f)
                close()
            }
        }
        .build()
        return _fieldHockey!!
    }

private var _fieldHockey: ImageVector? = null
