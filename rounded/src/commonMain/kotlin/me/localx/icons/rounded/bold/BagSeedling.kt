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

public val Icons.Bold.BagSeedling: ImageVector
    get() {
        if (_bagSeedling != null) {
            return _bagSeedling!!
        }
        _bagSeedling = Builder(name = "BagSeedling", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.966f, 8.5f)
                curveToRelative(-0.358f, 3.44f, -2.616f, 4.737f, -4.466f, 5.218f)
                verticalLineToRelative(1.782f)
                curveToRelative(0.0f, 0.829f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
                verticalLineToRelative(-1.83f)
                curveToRelative(-1.833f, -0.514f, -4.065f, -1.829f, -4.432f, -5.17f)
                curveToRelative(-0.098f, -0.887f, 0.712f, -1.618f, 1.585f, -1.432f)
                curveToRelative(2.291f, 0.488f, 3.603f, 1.932f, 4.353f, 3.375f)
                curveToRelative(0.756f, -1.443f, 2.075f, -2.887f, 4.377f, -3.374f)
                curveToRelative(0.872f, -0.184f, 1.677f, 0.544f, 1.584f, 1.43f)
                close()
                moveTo(22.817f, 22.652f)
                curveToRelative(-0.399f, 0.832f, -1.221f, 1.348f, -2.143f, 1.348f)
                lineTo(3.325f, 24.0f)
                curveToRelative(-0.922f, 0.0f, -1.743f, -0.517f, -2.143f, -1.348f)
                reflectiveCurveToRelative(-0.289f, -1.795f, 0.287f, -2.515f)
                lineToRelative(0.53f, -0.663f)
                lineTo(1.999f, 4.526f)
                lineToRelative(-0.531f, -0.664f)
                curveToRelative(-0.575f, -0.719f, -0.686f, -1.683f, -0.286f, -2.514f)
                reflectiveCurveTo(2.403f, 0.0f, 3.325f, 0.0f)
                horizontalLineToRelative(17.35f)
                curveToRelative(0.922f, 0.0f, 1.743f, 0.517f, 2.143f, 1.348f)
                reflectiveCurveToRelative(0.289f, 1.795f, -0.287f, 2.515f)
                lineToRelative(-0.53f, 0.663f)
                verticalLineToRelative(14.948f)
                lineToRelative(0.531f, 0.664f)
                curveToRelative(0.575f, 0.719f, 0.686f, 1.683f, 0.286f, 2.514f)
                close()
                moveTo(19.0f, 20.0f)
                lineTo(19.0f, 4.0f)
                lineTo(5.0f, 4.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(14.0f)
                close()
            }
        }
        .build()
        return _bagSeedling!!
    }

private var _bagSeedling: ImageVector? = null
