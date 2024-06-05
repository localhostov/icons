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

public val Icons.Filled.FileCode: ImageVector
    get() {
        if (_fileCode != null) {
            return _fileCode!!
        }
        _fileCode = Builder(name = "FileCode", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.976f, 10.0f)
                horizontalLineToRelative(-6.976f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                lineTo(12.0f, 0.024f)
                curveToRelative(-0.161f, -0.011f, -0.322f, -0.024f, -0.485f, -0.024f)
                lineTo(7.0f, 0.0f)
                curveTo(4.243f, 0.0f, 2.0f, 2.243f, 2.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0.0f, -0.163f, -0.013f, -1.339f, -0.024f, -1.5f)
                close()
                moveTo(8.293f, 17.789f)
                lineToRelative(2.019f, 2.019f)
                curveToRelative(0.391f, 0.391f, 0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                lineToRelative(-2.019f, -2.019f)
                curveToRelative(-1.17f, -1.169f, -1.17f, -3.073f, 0.0f, -4.243f)
                lineToRelative(2.062f, -2.062f)
                curveToRelative(0.391f, -0.391f, 1.023f, -0.391f, 1.414f, 0.0f)
                curveToRelative(0.391f, 0.39f, 0.391f, 1.023f, 0.0f, 1.414f)
                lineToRelative(-2.062f, 2.062f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.024f, 0.0f, 1.415f)
                close()
                moveTo(17.121f, 19.203f)
                lineToRelative(-2.019f, 2.019f)
                curveToRelative(-0.195f, 0.195f, -0.451f, 0.293f, -0.707f, 0.293f)
                reflectiveCurveToRelative(-0.512f, -0.098f, -0.707f, -0.293f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                lineToRelative(2.019f, -2.019f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.024f, 0.0f, -1.415f)
                lineToRelative(-2.062f, -2.062f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.024f, 0.0f, -1.414f)
                curveToRelative(0.391f, -0.391f, 1.023f, -0.391f, 1.414f, 0.0f)
                lineToRelative(2.062f, 2.062f)
                curveToRelative(1.17f, 1.169f, 1.17f, 3.073f, 0.0f, 4.243f)
                close()
                moveTo(14.0f, 7.0f)
                lineTo(14.0f, 0.46f)
                curveToRelative(0.913f, 0.346f, 1.753f, 0.879f, 2.465f, 1.59f)
                lineToRelative(3.484f, 3.486f)
                curveToRelative(0.712f, 0.711f, 1.245f, 1.551f, 1.591f, 2.464f)
                horizontalLineToRelative(-6.54f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.449f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _fileCode!!
    }

private var _fileCode: ImageVector? = null
