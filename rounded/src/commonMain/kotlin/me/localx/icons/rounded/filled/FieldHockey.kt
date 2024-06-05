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
                moveTo(14.165f, 8.832f)
                lineToRelative(5.249f, -7.707f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 3.4f, -0.753f)
                horizontalLineToRelative(0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.776f, 3.5f)
                lineTo(18.333f, 11.59f)
                close()
                moveTo(13.065f, 10.503f)
                lineTo(7.7f, 18.3f)
                arcToRelative(1.46f, 1.46f, 0.0f, true, true, -2.486f, -1.533f)
                arcTo(2.5f, 2.5f, 0.0f, true, false, 0.958f, 14.142f)
                arcToRelative(6.46f, 6.46f, 0.0f, false, false, 11.0f, 6.784f)
                lineToRelative(5.28f, -7.666f)
                close()
                moveTo(24.0f, 20.491f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, -3.5f, 3.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 24.0f, 20.491f)
                close()
            }
        }
        .build()
        return _fieldHockey!!
    }

private var _fieldHockey: ImageVector? = null
