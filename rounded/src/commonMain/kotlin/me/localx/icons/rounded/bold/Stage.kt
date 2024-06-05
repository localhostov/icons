package me.localx.icons.rounded.bold

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

public val Icons.Bold.Stage: ImageVector
    get() {
        if (_stage != null) {
            return _stage!!
        }
        _stage = Builder(name = "Stage", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.5f, 21.0f)
                horizontalLineToRelative(-3.879f)
                lineToRelative(-5.121f, -5.121f)
                lineTo(13.5f, 7.621f)
                lineToRelative(1.733f, -1.733f)
                curveToRelative(0.246f, 0.065f, 0.5f, 0.112f, 0.767f, 0.112f)
                curveToRelative(1.657f, 0.0f, 3.0f, -1.343f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.343f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.343f, -3.0f, 3.0f)
                curveToRelative(0.0f, 0.267f, 0.046f, 0.521f, 0.112f, 0.767f)
                lineToRelative(-4.672f, 4.672f)
                curveToRelative(-0.586f, 0.586f, -0.586f, 1.535f, 0.0f, 2.121f)
                curveToRelative(0.293f, 0.293f, 0.677f, 0.439f, 1.061f, 0.439f)
                curveToRelative(0.36f, 0.0f, 0.715f, -0.141f, 1.0f, -0.399f)
                verticalLineToRelative(5.278f)
                lineToRelative(-5.121f, 5.121f)
                lineTo(1.5f, 20.999f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(21.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(12.0f, 18.621f)
                lineToRelative(2.379f, 2.379f)
                horizontalLineToRelative(-4.758f)
                lineToRelative(2.379f, -2.379f)
                close()
            }
        }
        .build()
        return _stage!!
    }

private var _stage: ImageVector? = null
