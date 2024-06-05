package me.localx.icons.rounded.outline

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

public val Icons.Outline.TrashUndo: ImageVector
    get() {
        if (_trashUndo != null) {
            return _trashUndo!!
        }
        _trashUndo = Builder(name = "TrashUndo", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.0f, 15.5f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.552f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-1.898f)
                lineToRelative(1.293f, 1.293f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.024f, 0.0f, 1.414f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                lineToRelative(-1.613f, -1.614f)
                curveToRelative(-1.154f, -1.154f, -1.154f, -3.032f, 0.0f, -4.187f)
                lineToRelative(1.613f, -1.614f)
                curveToRelative(0.391f, -0.391f, 1.023f, -0.391f, 1.414f, 0.0f)
                curveToRelative(0.391f, 0.39f, 0.391f, 1.023f, 0.0f, 1.414f)
                lineToRelative(-1.293f, 1.293f)
                horizontalLineToRelative(1.898f)
                curveToRelative(2.206f, 0.0f, 4.0f, 1.794f, 4.0f, 4.0f)
                close()
                moveTo(23.0f, 5.0f)
                curveToRelative(0.0f, 0.552f, -0.447f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-0.886f)
                lineToRelative(-1.276f, 13.472f)
                curveToRelative(-0.244f, 2.582f, -2.384f, 4.528f, -4.977f, 4.528f)
                horizontalLineToRelative(-5.728f)
                curveToRelative(-2.59f, 0.0f, -4.729f, -1.944f, -4.977f, -4.521f)
                lineToRelative(-1.296f, -13.479f)
                horizontalLineToRelative(-0.861f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.447f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(4.101f)
                curveToRelative(0.465f, -2.279f, 2.485f, -4.0f, 4.899f, -4.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(2.414f, 0.0f, 4.435f, 1.721f, 4.899f, 4.0f)
                horizontalLineToRelative(4.101f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                close()
                moveTo(8.172f, 4.0f)
                horizontalLineToRelative(7.656f)
                curveToRelative(-0.413f, -1.164f, -1.524f, -2.0f, -2.828f, -2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.304f, 0.0f, -2.415f, 0.836f, -2.828f, 2.0f)
                close()
                moveTo(19.106f, 6.0f)
                lineTo(4.87f, 6.0f)
                lineToRelative(1.277f, 13.287f)
                curveToRelative(0.149f, 1.546f, 1.433f, 2.713f, 2.986f, 2.713f)
                horizontalLineToRelative(5.728f)
                curveToRelative(1.556f, 0.0f, 2.839f, -1.168f, 2.986f, -2.717f)
                lineToRelative(1.259f, -13.283f)
                close()
            }
        }
        .build()
        return _trashUndo!!
    }

private var _trashUndo: ImageVector? = null
