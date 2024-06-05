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

public val Icons.Filled.Strawberry: ImageVector
    get() {
        if (_strawberry != null) {
            return _strawberry!!
        }
        _strawberry = Builder(name = "Strawberry", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 8.0f)
                arcToRelative(16.453f, 16.453f, 0.0f, false, true, -5.856f, -0.73f)
                lineToRelative(4.563f, -4.563f)
                lineTo(21.293f, 1.293f)
                lineTo(16.73f, 5.856f)
                arcTo(16.453f, 16.453f, 0.0f, false, true, 16.0f, 0.0f)
                lineTo(14.0f, 0.0f)
                arcToRelative(27.473f, 27.473f, 0.0f, false, false, 0.247f, 4.37f)
                curveToRelative(-3.362f, -2.032f, -6.616f, -1.783f, -9.234f, 0.836f)
                curveTo(1.477f, 8.742f, -1.415f, 21.036f, 0.774f, 23.226f)
                arcToRelative(4.586f, 4.586f, 0.0f, false, false, 3.075f, 0.759f)
                curveToRelative(4.527f, 0.0f, 12.261f, -2.314f, 14.945f, -5.0f)
                curveToRelative(2.619f, -2.618f, 2.868f, -5.872f, 0.835f, -9.234f)
                arcTo(27.485f, 27.485f, 0.0f, false, false, 24.0f, 10.0f)
                close()
                moveTo(7.879f, 6.364f)
                arcTo(1.242f, 1.242f, 0.0f, true, true, 9.636f, 8.121f)
                arcTo(8.2f, 8.2f, 0.0f, false, true, 7.0f, 9.0f)
                arcTo(8.2f, 8.2f, 0.0f, false, true, 7.879f, 6.364f)
                close()
                moveTo(5.636f, 20.121f)
                arcTo(8.2f, 8.2f, 0.0f, false, true, 3.0f, 21.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, 0.879f, -2.636f)
                arcToRelative(1.242f, 1.242f, 0.0f, true, true, 1.757f, 1.757f)
                close()
                moveTo(7.636f, 14.121f)
                arcTo(8.2f, 8.2f, 0.0f, false, true, 5.0f, 15.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, 0.879f, -2.636f)
                arcToRelative(1.242f, 1.242f, 0.0f, true, true, 1.757f, 1.757f)
                close()
                moveTo(11.636f, 18.121f)
                arcTo(8.2f, 8.2f, 0.0f, false, true, 9.0f, 19.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, 0.879f, -2.636f)
                arcToRelative(1.242f, 1.242f, 0.0f, true, true, 1.757f, 1.757f)
                close()
                moveTo(13.636f, 12.121f)
                arcTo(8.2f, 8.2f, 0.0f, false, true, 11.0f, 13.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, 0.879f, -2.636f)
                arcToRelative(1.242f, 1.242f, 0.0f, true, true, 1.757f, 1.757f)
                close()
                moveTo(17.636f, 16.121f)
                arcTo(8.2f, 8.2f, 0.0f, false, true, 15.0f, 17.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, 0.879f, -2.636f)
                arcToRelative(1.242f, 1.242f, 0.0f, true, true, 1.757f, 1.757f)
                close()
            }
        }
        .build()
        return _strawberry!!
    }

private var _strawberry: ImageVector? = null
