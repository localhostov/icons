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

public val Icons.Outline.SolarPanel: ImageVector
    get() {
        if (_solarPanel != null) {
            return _solarPanel!!
        }
        _solarPanel = Builder(name = "SolarPanel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.0f, 18.0f)
                horizontalLineToRelative(10.961f)
                lineToRelative(-2.038f, -15.395f)
                curveToRelative(-0.197f, -1.485f, -1.476f, -2.605f, -2.974f, -2.605f)
                lineTo(5.05f, -0.0f)
                curveToRelative(-1.499f, 0.0f, -2.777f, 1.12f, -2.974f, 2.606f)
                lineTo(0.039f, 18.0f)
                horizontalLineToRelative(10.961f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(14.216f, 8.0f)
                horizontalLineToRelative(-4.432f)
                lineToRelative(0.2f, -6.0f)
                horizontalLineToRelative(4.032f)
                lineToRelative(0.2f, 6.0f)
                close()
                moveTo(14.283f, 10.0f)
                lineToRelative(0.2f, 6.0f)
                horizontalLineToRelative(-4.965f)
                lineToRelative(0.2f, -6.0f)
                horizontalLineToRelative(4.565f)
                close()
                moveTo(16.484f, 16.0f)
                lineToRelative(-0.2f, -6.0f)
                horizontalLineToRelative(4.601f)
                lineToRelative(0.794f, 6.0f)
                horizontalLineToRelative(-5.195f)
                close()
                moveTo(19.941f, 2.868f)
                lineToRelative(0.679f, 5.132f)
                horizontalLineToRelative(-4.403f)
                lineToRelative(-0.2f, -6.0f)
                horizontalLineToRelative(2.932f)
                curveToRelative(0.5f, 0.0f, 0.926f, 0.373f, 0.992f, 0.868f)
                close()
                moveTo(5.05f, 2.0f)
                horizontalLineToRelative(2.932f)
                lineToRelative(-0.2f, 6.0f)
                lineTo(3.38f, 8.0f)
                lineToRelative(0.679f, -5.131f)
                curveToRelative(0.066f, -0.496f, 0.492f, -0.869f, 0.992f, -0.869f)
                close()
                moveTo(3.115f, 10.0f)
                horizontalLineToRelative(4.601f)
                lineToRelative(-0.2f, 6.0f)
                lineTo(2.321f, 16.0f)
                lineToRelative(0.794f, -6.0f)
                close()
            }
        }
        .build()
        return _solarPanel!!
    }

private var _solarPanel: ImageVector? = null
