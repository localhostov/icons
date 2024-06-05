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

public val Icons.Outline.FieldHockey: ImageVector
    get() {
        if (_fieldHockey != null) {
            return _fieldHockey!!
        }
        _fieldHockey = Builder(name = "FieldHockey", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.935f, 0.014f)
                lineTo(7.785f, 17.539f)
                arcTo(0.96f, 0.96f, 0.0f, true, true, 6.15f, 16.532f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, -5.108f, -3.147f)
                arcTo(6.959f, 6.959f, 0.0f, false, false, 6.949f, 24.0f)
                arcToRelative(7.045f, 7.045f, 0.0f, false, false, 1.626f, -0.191f)
                arcToRelative(6.9f, 6.9f, 0.0f, false, false, 4.31f, -3.106f)
                lineTo(24.042f, 3.162f)
                close()
                moveTo(19.563f, 2.751f)
                lineTo(21.263f, 3.8f)
                lineTo(16.863f, 10.724f)
                lineTo(15.195f, 9.624f)
                close()
                moveTo(11.19f, 19.638f)
                arcToRelative(4.96f, 4.96f, 0.0f, false, true, -8.446f, -5.2f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.7f, 1.049f)
                arcTo(2.96f, 2.96f, 0.0f, false, false, 9.48f, 18.6f)
                lineToRelative(4.64f, -7.293f)
                lineToRelative(1.667f, 1.1f)
                close()
                moveTo(20.5f, 17.0f)
                arcTo(3.5f, 3.5f, 0.0f, true, false, 24.0f, 20.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 20.5f, 17.0f)
                close()
                moveTo(20.5f, 22.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 22.0f, 20.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 20.5f, 22.0f)
                close()
            }
        }
        .build()
        return _fieldHockey!!
    }

private var _fieldHockey: ImageVector? = null
