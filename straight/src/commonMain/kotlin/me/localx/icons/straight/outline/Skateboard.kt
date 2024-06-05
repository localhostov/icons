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

public val Icons.Outline.Skateboard: ImageVector
    get() {
        if (_skateboard != null) {
            return _skateboard!!
        }
        _skateboard = Builder(name = "Skateboard", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.835f, 2.165f)
                arcToRelative(7.389f, 7.389f, 0.0f, false, false, -10.451f, 0.0f)
                lineToRelative(-9.219f, 9.219f)
                arcToRelative(7.39f, 7.39f, 0.0f, true, false, 10.451f, 10.451f)
                lineToRelative(9.219f, -9.219f)
                arcToRelative(7.389f, 7.389f, 0.0f, false, false, 0.0f, -10.451f)
                close()
                moveTo(20.421f, 11.2f)
                lineTo(11.2f, 20.421f)
                arcToRelative(5.39f, 5.39f, 0.0f, true, true, -7.621f, -7.621f)
                lineToRelative(9.221f, -9.221f)
                arcToRelative(5.39f, 5.39f, 0.0f, true, true, 7.621f, 7.621f)
                close()
                moveTo(18.293f, 8.293f)
                lineTo(19.707f, 9.707f)
                lineTo(16.707f, 12.707f)
                lineTo(15.293f, 11.293f)
                lineTo(16.086f, 10.5f)
                lineTo(13.5f, 7.914f)
                lineTo(12.707f, 8.707f)
                lineTo(11.293f, 7.293f)
                lineTo(14.293f, 4.293f)
                lineTo(15.707f, 5.707f)
                lineTo(14.914f, 6.5f)
                lineTo(17.5f, 9.086f)
                close()
                moveTo(11.293f, 15.293f)
                lineTo(12.707f, 16.707f)
                lineTo(9.707f, 19.707f)
                lineTo(8.293f, 18.293f)
                lineTo(9.086f, 17.5f)
                lineTo(6.5f, 14.914f)
                lineTo(5.707f, 15.707f)
                lineTo(4.293f, 14.293f)
                lineTo(7.293f, 11.293f)
                lineTo(8.707f, 12.707f)
                lineTo(7.914f, 13.5f)
                lineTo(10.5f, 16.086f)
                close()
            }
        }
        .build()
        return _skateboard!!
    }

private var _skateboard: ImageVector? = null
