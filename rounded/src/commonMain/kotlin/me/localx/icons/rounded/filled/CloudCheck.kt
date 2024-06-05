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

public val Icons.Filled.CloudCheck: ImageVector
    get() {
        if (_cloudCheck != null) {
            return _cloudCheck!!
        }
        _cloudCheck = Builder(name = "CloudCheck", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.356f, 7.36f)
                arcToRelative(1.085f, 1.085f, 0.0f, false, true, -0.721f, -0.732f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -15.49f, 0.841f)
                arcToRelative(7.652f, 7.652f, 0.0f, false, false, 0.8f, 5.18f)
                arcToRelative(5.446f, 5.446f, 0.0f, false, false, -2.888f, 5.651f)
                arcToRelative(5.844f, 5.844f, 0.0f, false, false, 5.626f, 4.7f)
                horizontalLineToRelative(9.1f)
                curveToRelative(5.073f, 0.0f, 8.852f, -3.028f, 9.19f, -7.362f)
                arcToRelative(7.962f, 7.962f, 0.0f, false, false, -5.617f, -8.278f)
                close()
                moveTo(19.228f, 14.707f)
                lineTo(13.813f, 20.121f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -4.242f, 0.0f)
                lineToRelative(-3.387f, -3.421f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.416f, -1.4f)
                lineToRelative(3.384f, 3.414f)
                arcToRelative(1.025f, 1.025f, 0.0f, false, false, 1.411f, 0.0f)
                lineToRelative(5.414f, -5.414f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.415f, 1.414f)
                close()
            }
        }
        .build()
        return _cloudCheck!!
    }

private var _cloudCheck: ImageVector? = null
