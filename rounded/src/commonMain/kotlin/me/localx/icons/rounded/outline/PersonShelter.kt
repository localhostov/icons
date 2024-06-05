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

public val Icons.Outline.PersonShelter: ImageVector
    get() {
        if (_personShelter != null) {
            return _personShelter!!
        }
        _personShelter = Builder(name = "PersonShelter", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 9.684f)
                verticalLineToRelative(13.316f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-13.316f)
                curveToRelative(0.0f, -0.999f, -0.494f, -1.928f, -1.322f, -2.486f)
                lineToRelative(-7.0f, -4.724f)
                curveToRelative(-1.02f, -0.688f, -2.336f, -0.688f, -3.355f, 0.0f)
                lineTo(3.322f, 7.198f)
                curveToRelative(-0.828f, 0.558f, -1.322f, 1.488f, -1.322f, 2.486f)
                verticalLineToRelative(13.316f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-13.316f)
                curveToRelative(0.0f, -1.665f, 0.824f, -3.214f, 2.203f, -4.145f)
                lineTo(9.203f, 0.816f)
                curveToRelative(1.699f, -1.146f, 3.895f, -1.147f, 5.594f, 0.0f)
                lineToRelative(7.0f, 4.723f)
                curveToRelative(1.379f, 0.931f, 2.203f, 2.48f, 2.203f, 4.145f)
                close()
                moveTo(14.5f, 7.5f)
                curveToRelative(0.0f, -1.381f, -1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.119f, 2.5f, -2.5f)
                close()
                moveTo(17.0f, 15.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 1.474f, -0.81f, 2.75f, -2.0f, 3.444f)
                verticalLineToRelative(3.556f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.553f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-3.556f)
                curveToRelative(-1.19f, -0.694f, -2.0f, -1.97f, -2.0f, -3.444f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -2.206f, 1.794f, -4.0f, 4.0f, -4.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, 1.794f, 4.0f, 4.0f)
                close()
                moveTo(15.0f, 15.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                verticalLineToRelative(-1.0f)
                close()
            }
        }
        .build()
        return _personShelter!!
    }

private var _personShelter: ImageVector? = null
