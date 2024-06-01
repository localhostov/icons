package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.Download: ImageVector
    get() {
        if (_download != null) {
            return _download!!
        }
        _download = Builder(name = "Download", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(9.8781f, 18.122f)
                    curveTo(11.0494f, 19.294f, 12.9488f, 19.2946f, 14.1208f, 18.1234f)
                    curveTo(14.1213f, 18.1229f, 14.1217f, 18.1225f, 14.1222f, 18.122f)
                    lineTo(17.3331f, 14.911f)
                    curveTo(17.7036f, 14.5014f, 17.6717f, 13.869f, 17.2621f, 13.4986f)
                    curveTo(16.8807f, 13.1537f, 16.2999f, 13.1543f, 15.9192f, 13.5f)
                    lineTo(12.9932f, 16.427f)
                    lineTo(13.0002f, 1.0f)
                    curveTo(13.0001f, 0.4477f, 12.5524f, 0.0f, 12.0001f, 0.0f)
                    curveTo(11.4478f, 0.0f, 11.0001f, 0.4477f, 11.0001f, 1.0f)
                    lineTo(10.9911f, 16.408f)
                    lineTo(8.0812f, 13.5f)
                    curveTo(7.6904f, 13.1095f, 7.0571f, 13.1098f, 6.6666f, 13.5005f)
                    curveTo(6.2762f, 13.8913f, 6.2764f, 14.5245f, 6.6672f, 14.915f)
                    lineTo(9.8781f, 18.122f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.0f, 16.0f)
                    curveTo(22.4477f, 16.0f, 22.0f, 16.4477f, 22.0f, 17.0f)
                    verticalLineTo(21.0f)
                    curveTo(22.0f, 21.5523f, 21.5523f, 22.0f, 21.0f, 22.0f)
                    horizontalLineTo(3.0f)
                    curveTo(2.4477f, 22.0f, 2.0f, 21.5523f, 2.0f, 21.0f)
                    verticalLineTo(17.0f)
                    curveTo(2.0f, 16.4477f, 1.5523f, 16.0f, 1.0f, 16.0f)
                    curveTo(0.4477f, 16.0f, 0.0f, 16.4477f, 0.0f, 17.0f)
                    verticalLineTo(21.0f)
                    curveTo(0.0f, 22.6569f, 1.3432f, 24.0f, 3.0f, 24.0f)
                    horizontalLineTo(21.0f)
                    curveTo(22.6568f, 24.0f, 24.0f, 22.6569f, 24.0f, 21.0f)
                    verticalLineTo(17.0f)
                    curveTo(24.0f, 16.4477f, 23.5523f, 16.0f, 23.0f, 16.0f)
                    close()
                }
            }
        }
        .build()
        return _download!!
    }

private var _download: ImageVector? = null
