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

public val Icons.Bold.ExternalWorld: ImageVector
    get() {
        if (_externalWorld != null) {
            return _externalWorld!!
        }
        _externalWorld = Builder(name = "ExternalWorld", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.243f, 8.0f)
                horizontalLineToRelative(1.257f)
                verticalLineToRelative(-3.5f)
                curveToRelative(-0.607f, -0.456f, -1.0f, -1.182f, -1.0f, -2.0f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                curveToRelative(0.0f, 0.818f, -0.393f, 1.544f, -1.0f, 2.0f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(1.257f)
                curveToRelative(0.776f, 0.0f, 1.165f, 0.939f, 0.616f, 1.488f)
                lineToRelative(-2.757f, 2.757f)
                curveToRelative(-0.34f, 0.34f, -0.892f, 0.34f, -1.233f, 0.0f)
                lineToRelative(-2.757f, -2.757f)
                curveToRelative(-0.549f, -0.549f, -0.16f, -1.488f, 0.616f, -1.488f)
                close()
                moveTo(12.0f, 24.0f)
                curveToRelative(-5.799f, 0.0f, -10.993f, -5.0f, -10.993f, -10.638f)
                curveToRelative(0.0f, -3.862f, 1.887f, -7.588f, 5.059f, -9.625f)
                curveToRelative(0.695f, -0.443f, 1.624f, -0.246f, 2.073f, 0.452f)
                curveToRelative(0.447f, 0.697f, 0.245f, 1.625f, -0.452f, 2.073f)
                curveToRelative(-2.024f, 1.299f, -3.333f, 3.395f, -3.624f, 5.737f)
                horizontalLineToRelative(4.449f)
                curveToRelative(0.804f, 0.0f, 1.465f, 0.634f, 1.499f, 1.438f)
                curveToRelative(0.106f, 2.564f, 1.137f, 4.867f, 1.99f, 6.358f)
                curveToRelative(0.854f, -1.491f, 1.884f, -3.794f, 1.99f, -6.358f)
                curveToRelative(0.034f, -0.804f, 0.695f, -1.438f, 1.499f, -1.438f)
                horizontalLineToRelative(4.449f)
                curveToRelative(-0.292f, -2.342f, -1.6f, -4.438f, -3.624f, -5.737f)
                curveToRelative(-0.697f, -0.448f, -0.899f, -1.376f, -0.452f, -2.073f)
                curveToRelative(0.449f, -0.698f, 1.378f, -0.896f, 2.073f, -0.452f)
                curveToRelative(3.172f, 2.036f, 5.059f, 5.763f, 5.059f, 9.625f)
                curveToRelative(0.0f, 5.638f, -5.195f, 10.638f, -10.993f, 10.638f)
                close()
                moveTo(8.9f, 20.375f)
                curveToRelative(-0.728f, -1.436f, -1.452f, -3.289f, -1.754f, -5.375f)
                horizontalLineToRelative(-2.893f)
                curveToRelative(0.627f, 2.429f, 2.37f, 4.414f, 4.647f, 5.375f)
                close()
                moveTo(19.747f, 15.0f)
                horizontalLineToRelative(-2.893f)
                curveToRelative(-0.302f, 2.086f, -1.025f, 3.939f, -1.754f, 5.375f)
                curveToRelative(2.277f, -0.961f, 4.02f, -2.946f, 4.647f, -5.375f)
                close()
            }
        }
        .build()
        return _externalWorld!!
    }

private var _externalWorld: ImageVector? = null
