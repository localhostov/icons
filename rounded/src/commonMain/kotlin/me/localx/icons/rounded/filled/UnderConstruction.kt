package me.localx.icons.rounded.filled

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

public val Icons.Filled.UnderConstruction: ImageVector
    get() {
        if (_underConstruction != null) {
            return _underConstruction!!
        }
        _underConstruction = Builder(name = "UnderConstruction", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.048f, 13.0f)
                horizontalLineToRelative(3.907f)
                lineToRelative(0.596f, 2.0f)
                horizontalLineToRelative(-5.099f)
                lineToRelative(0.596f, -2.0f)
                close()
                moveTo(11.801f, 7.114f)
                lineToRelative(-1.157f, 3.886f)
                horizontalLineToRelative(2.715f)
                lineToRelative(-1.159f, -3.886f)
                curveToRelative(-0.089f, -0.136f, -0.311f, -0.137f, -0.399f, 0.0f)
                close()
                moveTo(1.447f, 8.502f)
                lineTo(8.501f, 1.448f)
                curveToRelative(1.931f, -1.931f, 5.062f, -1.931f, 6.993f, 0.0f)
                lineToRelative(7.055f, 7.055f)
                curveToRelative(1.931f, 1.931f, 1.931f, 5.062f, 0.0f, 6.994f)
                lineToRelative(-7.055f, 7.055f)
                curveToRelative(-1.931f, 1.931f, -5.062f, 1.931f, -6.993f, 0.0f)
                lineTo(1.447f, 15.496f)
                curveToRelative(-1.931f, -1.931f, -1.931f, -5.062f, 0.0f, -6.993f)
                close()
                moveTo(12.0f, 5.011f)
                curveToRelative(-0.889f, 0.0f, -1.671f, 0.502f, -2.041f, 1.311f)
                lineToRelative(-2.594f, 8.678f)
                horizontalLineToRelative(-0.366f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-0.362f)
                lineToRelative(-2.598f, -8.678f)
                curveToRelative(-0.37f, -0.809f, -1.152f, -1.311f, -2.041f, -1.311f)
                close()
            }
        }
        .build()
        return _underConstruction!!
    }

private var _underConstruction: ImageVector? = null
