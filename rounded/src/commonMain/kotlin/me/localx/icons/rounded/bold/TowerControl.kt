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

public val Icons.Bold.TowerControl: ImageVector
    get() {
        if (_towerControl != null) {
            return _towerControl!!
        }
        _towerControl = Builder(name = "TowerControl", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.979f, 6.646f)
                curveToRelative(-0.857f, -1.046f, -2.126f, -1.646f, -3.479f, -1.646f)
                horizontalLineToRelative(-2.499f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.379f, -1.121f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-1.379f, 0.0f, -2.5f, 1.121f, -2.5f, 2.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-2.499f)
                curveToRelative(-1.354f, 0.0f, -2.622f, 0.601f, -3.479f, 1.646f)
                curveTo(0.163f, 7.693f, -0.177f, 9.055f, 0.089f, 10.382f)
                lineToRelative(0.72f, 3.599f)
                curveToRelative(0.466f, 2.329f, 2.527f, 4.02f, 4.902f, 4.02f)
                horizontalLineToRelative(1.289f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(1.289f)
                curveToRelative(2.375f, 0.0f, 4.437f, -1.69f, 4.902f, -4.02f)
                lineToRelative(0.72f, -3.599f)
                curveToRelative(0.266f, -1.327f, -0.074f, -2.688f, -0.933f, -3.735f)
                close()
                moveTo(7.0f, 12.0f)
                lineTo(3.471f, 12.0f)
                lineToRelative(-0.441f, -2.206f)
                curveToRelative(-0.088f, -0.442f, 0.025f, -0.896f, 0.312f, -1.245f)
                curveToRelative(0.285f, -0.349f, 0.708f, -0.549f, 1.159f, -0.549f)
                horizontalLineToRelative(2.499f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(14.0f, 20.5f)
                curveToRelative(0.0f, 0.275f, -0.225f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.275f, 0.0f, -0.5f, -0.225f, -0.5f, -0.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.5f)
                close()
                moveTo(14.0f, 12.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(20.97f, 9.794f)
                lineToRelative(-0.441f, 2.206f)
                horizontalLineToRelative(-3.529f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.499f)
                curveToRelative(0.451f, 0.0f, 0.874f, 0.2f, 1.159f, 0.549f)
                curveToRelative(0.286f, 0.349f, 0.399f, 0.803f, 0.312f, 1.245f)
                close()
            }
        }
        .build()
        return _towerControl!!
    }

private var _towerControl: ImageVector? = null
