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
                moveToRelative(10.643f, 11.0f)
                lineToRelative(1.157f, -3.886f)
                curveToRelative(0.089f, -0.137f, 0.311f, -0.136f, 0.399f, 0.0f)
                lineToRelative(1.159f, 3.886f)
                horizontalLineToRelative(-2.715f)
                close()
                moveTo(13.955f, 13.0f)
                horizontalLineToRelative(-3.907f)
                lineToRelative(-0.596f, 2.0f)
                horizontalLineToRelative(5.099f)
                lineToRelative(-0.596f, -2.0f)
                close()
                moveTo(24.0f, 11.999f)
                curveToRelative(0.0f, 0.867f, -0.337f, 1.683f, -0.95f, 2.296f)
                lineToRelative(-8.756f, 8.755f)
                curveToRelative(-0.633f, 0.633f, -1.464f, 0.949f, -2.296f, 0.949f)
                reflectiveCurveToRelative(-1.662f, -0.316f, -2.295f, -0.949f)
                lineTo(0.948f, 14.294f)
                curveTo(0.334f, 13.682f, -0.003f, 12.866f, -0.003f, 11.999f)
                curveToRelative(0.0f, -0.867f, 0.337f, -1.682f, 0.95f, -2.295f)
                lineTo(9.703f, 0.949f)
                curveToRelative(1.266f, -1.266f, 3.325f, -1.266f, 4.591f, 0.0f)
                lineToRelative(8.755f, 8.755f)
                curveToRelative(0.613f, 0.613f, 0.951f, 1.428f, 0.951f, 2.295f)
                close()
                moveTo(18.0f, 15.0f)
                horizontalLineToRelative(-1.362f)
                lineToRelative(-2.598f, -8.678f)
                curveToRelative(-0.37f, -0.809f, -1.152f, -1.311f, -2.041f, -1.311f)
                reflectiveCurveToRelative(-1.671f, 0.502f, -2.041f, 1.311f)
                lineToRelative(-2.594f, 8.678f)
                horizontalLineToRelative(-1.366f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _underConstruction!!
    }

private var _underConstruction: ImageVector? = null
