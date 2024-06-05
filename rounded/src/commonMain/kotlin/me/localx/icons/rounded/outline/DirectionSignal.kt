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

public val Icons.Outline.DirectionSignal: ImageVector
    get() {
        if (_directionSignal != null) {
            return _directionSignal!!
        }
        _directionSignal = Builder(name = "DirectionSignal", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.707f, 13.793f)
                lineToRelative(-1.914f, -1.914f)
                curveToRelative(-0.566f, -0.567f, -1.32f, -0.879f, -2.122f, -0.879f)
                horizontalLineToRelative(-5.671f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(6.5f)
                curveToRelative(1.378f, 0.0f, 2.5f, -1.122f, 2.5f, -2.5f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.378f, -1.122f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-6.506f)
                lineToRelative(0.006f, -0.994f)
                curveToRelative(0.003f, -0.553f, -0.442f, -1.003f, -0.995f, -1.006f)
                horizontalLineToRelative(-0.005f)
                curveToRelative(-0.55f, 0.0f, -0.997f, 0.444f, -1.0f, 0.994f)
                lineToRelative(-0.006f, 1.006f)
                horizontalLineToRelative(-5.666f)
                curveToRelative(-0.801f, 0.0f, -1.555f, 0.312f, -2.122f, 0.879f)
                lineToRelative(-1.914f, 1.914f)
                curveToRelative(-0.391f, 0.391f, -0.391f, 1.023f, 0.0f, 1.414f)
                lineToRelative(1.914f, 1.914f)
                curveToRelative(0.566f, 0.567f, 1.32f, 0.879f, 2.122f, 0.879f)
                horizontalLineToRelative(5.671f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-6.5f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.122f, -2.5f, 2.5f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.378f, 1.122f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(6.491f)
                lineToRelative(0.009f, 5.002f)
                curveToRelative(0.0f, 0.552f, 0.449f, 0.998f, 1.0f, 0.998f)
                horizontalLineToRelative(0.002f)
                curveToRelative(0.552f, 0.0f, 0.999f, -0.45f, 0.998f, -1.002f)
                lineToRelative(-0.009f, -4.998f)
                horizontalLineToRelative(5.681f)
                curveToRelative(0.801f, 0.0f, 1.555f, -0.312f, 2.122f, -0.879f)
                lineToRelative(1.914f, -1.914f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                close()
                moveTo(4.621f, 6.707f)
                lineToRelative(-1.207f, -1.207f)
                lineToRelative(1.207f, -1.207f)
                curveToRelative(0.189f, -0.189f, 0.44f, -0.293f, 0.708f, -0.293f)
                horizontalLineToRelative(14.171f)
                curveToRelative(0.276f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
                lineTo(5.329f, 7.0f)
                curveToRelative(-0.267f, 0.0f, -0.519f, -0.104f, -0.708f, -0.293f)
                close()
                moveTo(19.379f, 15.707f)
                curveToRelative(-0.189f, 0.189f, -0.44f, 0.293f, -0.708f, 0.293f)
                lineTo(4.5f, 16.0f)
                curveToRelative(-0.276f, 0.0f, -0.5f, -0.224f, -0.5f, -0.5f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(14.171f)
                curveToRelative(0.267f, 0.0f, 0.519f, 0.104f, 0.708f, 0.293f)
                lineToRelative(1.207f, 1.207f)
                lineToRelative(-1.207f, 1.207f)
                close()
            }
        }
        .build()
        return _directionSignal!!
    }

private var _directionSignal: ImageVector? = null
