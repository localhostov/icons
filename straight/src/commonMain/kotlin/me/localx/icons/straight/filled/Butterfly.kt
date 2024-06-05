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

public val Icons.Filled.Butterfly: ImageVector
    get() {
        if (_butterfly != null) {
            return _butterfly!!
        }
        _butterfly = Builder(name = "Butterfly", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 10.0f, 2.0f)
                close()
                moveTo(22.613f, 2.506f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 18.84f, 1.259f)
                arcTo(19.479f, 19.479f, 0.0f, false, false, 13.0f, 5.518f)
                verticalLineToRelative(8.775f)
                arcTo(10.944f, 10.944f, 0.0f, false, false, 17.0f, 15.0f)
                arcToRelative(6.972f, 6.972f, 0.0f, false, false, 6.993f, -6.678f)
                arcTo(12.267f, 12.267f, 0.0f, false, false, 22.613f, 2.506f)
                close()
                moveTo(22.271f, 15.261f)
                arcTo(8.9f, 8.9f, 0.0f, false, true, 17.0f, 17.0f)
                arcToRelative(12.785f, 12.785f, 0.0f, false, true, -5.0f, -0.96f)
                arcTo(12.785f, 12.785f, 0.0f, false, true, 7.0f, 17.0f)
                arcToRelative(8.9f, 8.9f, 0.0f, false, true, -5.271f, -1.739f)
                curveToRelative(-1.915f, 3.087f, 0.52f, 7.5f, 1.337f, 8.235f)
                lineToRelative(0.4f, 0.459f)
                lineToRelative(0.592f, -0.148f)
                arcTo(15.32f, 15.32f, 0.0f, false, false, 11.0f, 19.647f)
                lineTo(11.0f, 22.0f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 19.647f)
                arcToRelative(15.32f, 15.32f, 0.0f, false, false, 6.939f, 4.16f)
                lineToRelative(0.592f, 0.148f)
                lineToRelative(0.4f, -0.459f)
                curveTo(21.763f, 22.751f, 24.18f, 18.323f, 22.271f, 15.261f)
                close()
                moveTo(7.206f, 15.0f)
                arcTo(9.811f, 9.811f, 0.0f, false, false, 11.0f, 14.293f)
                lineTo(11.0f, 5.518f)
                arcTo(19.479f, 19.479f, 0.0f, false, false, 5.16f, 1.259f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 1.386f, 2.506f)
                arcTo(12.279f, 12.279f, 0.0f, false, false, 0.007f, 8.322f)
                arcTo(7.071f, 7.071f, 0.0f, false, false, 7.206f, 15.0f)
                close()
            }
        }
        .build()
        return _butterfly!!
    }

private var _butterfly: ImageVector? = null
