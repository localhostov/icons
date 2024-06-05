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

public val Icons.Bold.PersonShelter: ImageVector
    get() {
        if (_personShelter != null) {
            return _personShelter!!
        }
        _personShelter = Builder(name = "PersonShelter", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 11.0f)
                curveToRelative(-1.381f, 0.0f, -2.5f, -1.119f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                close()
                moveTo(17.0f, 16.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 1.474f, -0.81f, 2.75f, -2.0f, 3.444f)
                verticalLineToRelative(2.056f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-2.056f)
                curveToRelative(-1.19f, -0.694f, -2.0f, -1.97f, -2.0f, -3.444f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -2.206f, 1.794f, -4.0f, 4.0f, -4.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, 1.794f, 4.0f, 4.0f)
                close()
                moveTo(10.0f, 17.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(21.576f, 5.327f)
                lineTo(15.076f, 0.941f)
                curveToRelative(-1.869f, -1.262f, -4.283f, -1.262f, -6.152f, 0.0f)
                lineTo(2.424f, 5.327f)
                curveToRelative(-1.518f, 1.024f, -2.424f, 2.729f, -2.424f, 4.56f)
                verticalLineToRelative(12.614f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-12.614f)
                curveToRelative(0.0f, -0.833f, 0.412f, -1.607f, 1.102f, -2.073f)
                lineToRelative(6.5f, -4.386f)
                curveToRelative(0.85f, -0.573f, 1.947f, -0.573f, 2.797f, 0.0f)
                lineToRelative(6.5f, 4.387f)
                curveToRelative(0.689f, 0.465f, 1.102f, 1.24f, 1.102f, 2.072f)
                verticalLineToRelative(12.614f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineToRelative(-12.614f)
                curveToRelative(0.0f, -1.831f, -0.906f, -3.536f, -2.424f, -4.559f)
                close()
            }
        }
        .build()
        return _personShelter!!
    }

private var _personShelter: ImageVector? = null
