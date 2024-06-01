package me.localx.icons.straight.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Bold.CursorPlus: ImageVector
    get() {
        if (_cursorPlus != null) {
            return _cursorPlus!!
        }
        _cursorPlus = Builder(name = "CursorPlus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(15.5f, 7.0f)
                    curveTo(13.8189f, 7.0f, 12.1755f, 7.4985f, 10.7777f, 8.4325f)
                    curveTo(9.3798f, 9.3665f, 8.2904f, 10.694f, 7.647f, 12.2472f)
                    curveTo(7.0037f, 13.8004f, 6.8354f, 15.5094f, 7.1633f, 17.1583f)
                    curveTo(7.4913f, 18.8071f, 8.3008f, 20.3217f, 9.4896f, 21.5104f)
                    curveTo(10.6783f, 22.6992f, 12.1929f, 23.5087f, 13.8417f, 23.8367f)
                    curveTo(15.4906f, 24.1647f, 17.1996f, 23.9963f, 18.7528f, 23.353f)
                    curveTo(20.306f, 22.7096f, 21.6335f, 21.6202f, 22.5675f, 20.2223f)
                    curveTo(23.5015f, 18.8245f, 24.0f, 17.1811f, 24.0f, 15.5f)
                    curveTo(23.9974f, 13.2465f, 23.101f, 11.086f, 21.5075f, 9.4925f)
                    curveTo(19.914f, 7.899f, 17.7535f, 7.0026f, 15.5f, 7.0f)
                    close()
                    moveTo(15.5f, 21.0f)
                    curveTo(14.4122f, 21.0f, 13.3488f, 20.6774f, 12.4444f, 20.0731f)
                    curveTo(11.5399f, 19.4687f, 10.8349f, 18.6098f, 10.4187f, 17.6048f)
                    curveTo(10.0024f, 16.5998f, 9.8935f, 15.4939f, 10.1057f, 14.427f)
                    curveTo(10.3179f, 13.3601f, 10.8417f, 12.3801f, 11.6109f, 11.6109f)
                    curveTo(12.3801f, 10.8417f, 13.3601f, 10.3179f, 14.427f, 10.1057f)
                    curveTo(15.4939f, 9.8935f, 16.5998f, 10.0024f, 17.6048f, 10.4187f)
                    curveTo(18.6098f, 10.8349f, 19.4687f, 11.5399f, 20.0731f, 12.4444f)
                    curveTo(20.6774f, 13.3488f, 21.0f, 14.4122f, 21.0f, 15.5f)
                    curveTo(20.9981f, 16.9581f, 20.4181f, 18.356f, 19.387f, 19.387f)
                    curveTo(18.356f, 20.4181f, 16.9581f, 20.9981f, 15.5f, 21.0f)
                    close()
                    moveTo(17.0f, 14.0f)
                    horizontalLineTo(19.0f)
                    verticalLineTo(17.0f)
                    horizontalLineTo(17.0f)
                    verticalLineTo(19.0f)
                    horizontalLineTo(14.0f)
                    verticalLineTo(17.0f)
                    horizontalLineTo(12.0f)
                    verticalLineTo(14.0f)
                    horizontalLineTo(14.0f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(17.0f)
                    verticalLineTo(14.0f)
                    close()
                    moveTo(7.184f, 7.184f)
                    lineTo(4.447f, 13.0f)
                    lineTo(0.0f, 0.0f)
                    lineTo(13.0f, 4.447f)
                    lineTo(7.184f, 7.184f)
                    close()
                }
            }
        }
        .build()
        return _cursorPlus!!
    }

private var _cursorPlus: ImageVector? = null
