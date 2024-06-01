package me.localx.icons.straight.bold

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
import me.localx.icons.straight.Icons

public val Icons.Bold.Upload: ImageVector
    get() {
        if (_upload != null) {
            return _upload!!
        }
        _upload = Builder(name = "Upload", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(10.5421f, 4.3217f)
                    lineTo(10.5651f, 19.0007f)
                    horizontalLineTo(13.5651f)
                    lineTo(13.5421f, 4.3397f)
                    lineTo(16.3061f, 7.1007f)
                    lineTo(18.4271f, 4.9787f)
                    lineTo(14.5081f, 1.0627f)
                    curveTo(14.1831f, 0.7377f, 13.7972f, 0.4798f, 13.3726f, 0.3039f)
                    curveTo(12.9479f, 0.128f, 12.4928f, 0.0374f, 12.0331f, 0.0374f)
                    curveTo(11.5734f, 0.0374f, 11.1183f, 0.128f, 10.6936f, 0.3039f)
                    curveTo(10.269f, 0.4798f, 9.8831f, 0.7377f, 9.5581f, 1.0627f)
                    lineTo(5.6391f, 4.9817f)
                    lineTo(7.7601f, 7.1007f)
                    lineTo(10.5421f, 4.3217f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.0f, 15.9994f)
                    verticalLineTo(20.9994f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(15.9994f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(20.9994f)
                    curveTo(0.0f, 21.795f, 0.3161f, 22.5581f, 0.8787f, 23.1207f)
                    curveTo(1.4413f, 23.6833f, 2.2043f, 23.9994f, 3.0f, 23.9994f)
                    horizontalLineTo(21.0f)
                    curveTo(21.7956f, 23.9994f, 22.5587f, 23.6833f, 23.1213f, 23.1207f)
                    curveTo(23.6839f, 22.5581f, 24.0f, 21.795f, 24.0f, 20.9994f)
                    verticalLineTo(15.9994f)
                    horizontalLineTo(21.0f)
                    close()
                }
            }
        }
        .build()
        return _upload!!
    }

private var _upload: ImageVector? = null
