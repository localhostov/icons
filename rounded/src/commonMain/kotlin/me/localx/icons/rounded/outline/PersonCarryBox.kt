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

public val Icons.Outline.PersonCarryBox: ImageVector
    get() {
        if (_personCarryBox != null) {
            return _personCarryBox!!
        }
        _personCarryBox = Builder(name = "PersonCarryBox", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.5f, 5.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-1.379f, 0.0f, -2.5f, 1.122f, -2.5f, 2.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-1.382f)
                lineToRelative(-1.369f, -2.739f)
                curveToRelative(-0.697f, -1.395f, -2.1f, -2.261f, -3.659f, -2.261f)
                curveToRelative(-1.979f, 0.0f, -3.59f, 1.611f, -3.59f, 3.604f)
                lineToRelative(0.054f, 3.78f)
                curveToRelative(0.02f, 1.394f, 0.744f, 2.654f, 1.938f, 3.371f)
                lineToRelative(2.524f, 1.518f)
                curveToRelative(0.299f, 0.18f, 0.484f, 0.509f, 0.484f, 0.857f)
                verticalLineToRelative(3.869f)
                curveToRelative(0.0f, 0.552f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-3.869f)
                curveToRelative(0.0f, -1.046f, -0.557f, -2.031f, -1.453f, -2.571f)
                lineToRelative(-2.525f, -1.519f)
                curveToRelative(-0.596f, -0.359f, -0.958f, -0.989f, -0.968f, -1.686f)
                lineToRelative(-0.054f, -3.766f)
                curveToRelative(0.0f, -0.877f, 0.713f, -1.59f, 1.59f, -1.59f)
                curveToRelative(0.14f, 0.0f, 0.277f, 0.014f, 0.41f, 0.04f)
                verticalLineToRelative(4.96f)
                curveToRelative(0.0f, 0.552f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-2.765f)
                lineToRelative(0.829f, 1.658f)
                curveToRelative(0.34f, 0.683f, 1.025f, 1.106f, 1.789f, 1.106f)
                horizontalLineToRelative(6.882f)
                curveToRelative(1.379f, 0.0f, 2.5f, -1.122f, 2.5f, -2.5f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.378f, -1.121f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(19.0f, 10.5f)
                curveToRelative(0.0f, 0.276f, -0.225f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -0.276f, 0.225f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.275f, 0.0f, 0.5f, 0.224f, 0.5f, 0.5f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(4.0f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(6.0f, 20.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.552f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.552f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _personCarryBox!!
    }

private var _personCarryBox: ImageVector? = null
