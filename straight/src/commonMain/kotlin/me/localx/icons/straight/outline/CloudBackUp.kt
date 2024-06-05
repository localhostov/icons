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

public val Icons.Outline.CloudBackUp: ImageVector
    get() {
        if (_cloudBackUp != null) {
            return _cloudBackUp!!
        }
        _cloudBackUp = Builder(name = "CloudBackUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 12.5f)
                curveToRelative(0.0f, 2.46f, -1.186f, 4.693f, -3.097f, 6.075f)
                lineToRelative(-1.45f, -1.45f)
                curveToRelative(1.558f, -0.992f, 2.547f, -2.709f, 2.547f, -4.625f)
                curveToRelative(0.0f, -2.688f, -1.919f, -4.967f, -4.563f, -5.419f)
                lineToRelative(-0.587f, -0.101f)
                lineToRelative(-0.191f, -0.564f)
                curveToRelative(-0.894f, -2.641f, -3.368f, -4.415f, -6.158f, -4.415f)
                curveToRelative(-3.584f, 0.0f, -6.5f, 2.916f, -6.5f, 6.5f)
                curveToRelative(0.0f, 0.614f, 0.085f, 1.22f, 0.253f, 1.801f)
                lineToRelative(0.219f, 0.76f)
                lineToRelative(-0.688f, 0.389f)
                curveToRelative(-1.1f, 0.621f, -1.783f, 1.79f, -1.783f, 3.05f)
                curveToRelative(0.0f, 1.93f, 1.346f, 3.5f, 3.0f, 3.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.468f, -5.0f, -5.5f)
                curveToRelative(0.0f, -1.722f, 0.811f, -3.334f, 2.157f, -4.367f)
                curveToRelative(-0.104f, -0.535f, -0.157f, -1.082f, -0.157f, -1.633f)
                curveTo(2.0f, 3.813f, 5.813f, 0.0f, 10.5f, 0.0f)
                curveToRelative(3.453f, 0.0f, 6.537f, 2.079f, 7.848f, 5.23f)
                curveToRelative(3.309f, 0.833f, 5.652f, 3.803f, 5.652f, 7.27f)
                close()
                moveTo(17.0f, 21.0f)
                verticalLineToRelative(-10.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(10.0f)
                lineToRelative(-1.75f, -1.75f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(2.75f, 2.75f)
                curveToRelative(0.39f, 0.39f, 0.902f, 0.585f, 1.414f, 0.585f)
                reflectiveCurveToRelative(1.024f, -0.195f, 1.414f, -0.585f)
                lineToRelative(2.75f, -2.75f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-1.75f, 1.75f)
                close()
                moveTo(13.164f, 14.336f)
                lineToRelative(-2.75f, -2.75f)
                curveToRelative(-0.779f, -0.78f, -2.049f, -0.78f, -2.828f, 0.0f)
                lineToRelative(-2.75f, 2.75f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(1.75f, -1.75f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-10.0f)
                lineToRelative(1.75f, 1.75f)
                lineToRelative(1.414f, -1.414f)
                close()
            }
        }
        .build()
        return _cloudBackUp!!
    }

private var _cloudBackUp: ImageVector? = null
