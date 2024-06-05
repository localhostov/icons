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

public val Icons.Outline.Poo: ImageVector
    get() {
        if (_poo != null) {
            return _poo!!
        }
        _poo = Builder(name = "Poo", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.336f, 15.253f)
                lineToRelative(1.33f, 1.493f)
                arcTo(9.454f, 9.454f, 0.0f, false, true, 12.0f, 19.0f)
                arcToRelative(9.454f, 9.454f, 0.0f, false, true, -5.666f, -2.254f)
                lineToRelative(1.332f, -1.492f)
                arcTo(7.509f, 7.509f, 0.0f, false, false, 12.0f, 17.0f)
                arcTo(7.517f, 7.517f, 0.0f, false, false, 16.336f, 15.253f)
                close()
                moveTo(9.5f, 14.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 8.0f, 12.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 9.5f, 14.0f)
                close()
                moveTo(14.5f, 14.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 13.0f, 12.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 14.5f, 14.0f)
                close()
                moveTo(24.0f, 18.5f)
                arcTo(5.506f, 5.506f, 0.0f, false, true, 18.5f, 24.0f)
                lineTo(5.5f, 24.0f)
                arcToRelative(5.484f, 5.484f, 0.0f, false, true, -3.361f, -9.829f)
                arcToRelative(4.97f, 4.97f, 0.0f, false, true, 1.9f, -5.178f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 7.5f, 5.0f)
                lineTo(8.806f, 5.0f)
                arcTo(4.1f, 4.1f, 0.0f, false, false, 11.0f, 1.0f)
                lineTo(11.0f, 0.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(2.4f, 0.0f, 4.408f, 2.747f, 4.89f, 5.021f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.075f, 3.972f)
                arcToRelative(4.97f, 4.97f, 0.0f, false, true, 1.9f, 5.178f)
                arcTo(5.483f, 5.483f, 0.0f, false, true, 24.0f, 18.5f)
                close()
                moveTo(22.0f, 18.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -1.813f, -3.044f)
                lineToRelative(-0.792f, -0.439f)
                lineToRelative(0.359f, -0.832f)
                arcToRelative(2.97f, 2.97f, 0.0f, false, false, -1.4f, -3.842f)
                lineToRelative(-0.819f, -0.42f)
                lineToRelative(0.35f, -0.852f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 16.5f, 7.0f)
                lineTo(15.0f, 7.0f)
                lineTo(15.0f, 6.0f)
                arcToRelative(5.237f, 5.237f, 0.0f, false, false, -2.1f, -3.691f)
                arcTo(5.773f, 5.773f, 0.0f, false, true, 9.316f, 6.948f)
                lineTo(9.162f, 7.0f)
                lineTo(7.5f, 7.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 6.115f, 9.071f)
                lineToRelative(0.35f, 0.852f)
                lineToRelative(-0.819f, 0.42f)
                arcToRelative(2.97f, 2.97f, 0.0f, false, false, -1.4f, 3.842f)
                lineToRelative(0.359f, 0.832f)
                lineToRelative(-0.792f, 0.439f)
                arcTo(3.486f, 3.486f, 0.0f, false, false, 5.5f, 22.0f)
                horizontalLineToRelative(13.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 22.0f, 18.5f)
                close()
            }
        }
        .build()
        return _poo!!
    }

private var _poo: ImageVector? = null
