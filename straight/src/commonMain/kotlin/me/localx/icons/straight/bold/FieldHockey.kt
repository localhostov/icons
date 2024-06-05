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
                moveTo(16.674f, 0.024f)
                lineTo(9.82f, 15.452f)
                arcToRelative(0.95f, 0.95f, 0.0f, true, true, -1.728f, -0.792f)
                arcTo(4.0f, 4.0f, 0.0f, true, false, 0.817f, 11.329f)
                arcTo(8.951f, 8.951f, 0.0f, true, false, 17.1f, 18.77f)
                lineTo(23.947f, 3.356f)
                close()
                moveTo(18.184f, 4.016f)
                lineTo(20.0f, 4.849f)
                lineToRelative(-2.335f, 5.258f)
                lineToRelative(-1.819f, -0.833f)
                close()
                moveTo(14.366f, 17.536f)
                arcTo(5.951f, 5.951f, 0.0f, false, true, 3.545f, 12.579f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.819f, 0.833f)
                arcToRelative(3.95f, 3.95f, 0.0f, true, false, 7.19f, 3.275f)
                lineToRelative(2.075f, -4.671f)
                lineToRelative(1.819f, 0.833f)
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
