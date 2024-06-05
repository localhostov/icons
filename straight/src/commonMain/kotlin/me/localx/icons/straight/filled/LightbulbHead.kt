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

public val Icons.Filled.LightbulbHead: ImageVector
    get() {
        if (_lightbulbHead != null) {
            return _lightbulbHead!!
        }
        _lightbulbHead = Builder(name = "LightbulbHead", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.135f, 3.826f)
                curveToRelative(0.419f, -1.821f, 1.866f, -3.27f, 3.688f, -3.69f)
                curveToRelative(1.525f, -0.35f, 3.087f, -0.005f, 4.288f, 0.949f)
                curveToRelative(1.201f, 0.955f, 1.89f, 2.382f, 1.89f, 3.915f)
                curveToRelative(0.0f, 1.586f, -0.76f, 3.061f, -2.034f, 4.0f)
                horizontalLineToRelative(-5.927f)
                curveToRelative(-1.611f, -1.185f, -2.361f, -3.185f, -1.904f, -5.174f)
                close()
                moveTo(17.0f, 11.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.001f)
                lineToRelative(-0.002f, -2.0f)
                horizontalLineToRelative(-3.999f)
                close()
                moveTo(15.0f, 15.0f)
                verticalLineToRelative(-3.354f)
                curveToRelative(0.0f, -0.548f, -0.225f, -1.073f, -0.627f, -1.446f)
                curveToRelative(-1.839f, -1.708f, -2.756f, -4.349f, -2.188f, -6.821f)
                curveToRelative(0.293f, -1.272f, 0.943f, -2.414f, 1.836f, -3.315f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-1.522f, -0.14f, -3.02f, 0.013f, -4.457f, 0.486f)
                curveToRelative(-2.145f, 0.708f, -4.0f, 2.046f, -5.342f, 3.839f)
                curveToRelative(-1.204f, 1.488f, -2.316f, 4.04f, -3.495f, 6.741f)
                curveToRelative(-0.214f, 0.491f, -0.728f, 1.658f, -0.728f, 1.658f)
                verticalLineToRelative(2.212f)
                horizontalLineToRelative(2.33f)
                lineToRelative(0.449f, 3.394f)
                curveToRelative(0.197f, 1.492f, 1.469f, 2.606f, 2.974f, 2.606f)
                horizontalLineToRelative(2.247f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(-4.709f)
                curveToRelative(0.0f, -0.482f, 0.189f, -0.937f, 0.496f, -1.31f)
                curveToRelative(0.747f, -0.907f, 1.325f, -1.915f, 1.743f, -2.981f)
                horizontalLineToRelative(-8.238f)
                close()
            }
        }
        .build()
        return _lightbulbHead!!
    }

private var _lightbulbHead: ImageVector? = null
