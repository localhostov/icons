package me.localx.icons.straight.bold

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

public val Icons.Bold.PrescriptionBottleAlt: ImageVector
    get() {
        if (_prescriptionBottleAlt != null) {
            return _prescriptionBottleAlt!!
        }
        _prescriptionBottleAlt = Builder(name = "PrescriptionBottleAlt", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.5f, 14.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.5f)
                close()
                moveTo(23.0f, 5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(15.5f)
                curveToRelative(0.0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(6.5f, 24.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(3.0f, 5.0f)
                lineTo(1.0f, 5.0f)
                verticalLineToRelative(-2.0f)
                curveTo(1.0f, 1.343f, 2.343f, 0.0f, 4.0f, 0.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.657f, 0.0f, 3.0f, 1.343f, 3.0f, 3.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(18.0f, 5.0f)
                lineTo(6.0f, 5.0f)
                verticalLineToRelative(15.5f)
                curveToRelative(0.0f, 0.275f, 0.224f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(11.0f)
                curveToRelative(0.276f, 0.0f, 0.5f, -0.225f, 0.5f, -0.5f)
                lineTo(18.0f, 5.0f)
                close()
            }
        }
        .build()
        return _prescriptionBottleAlt!!
    }

private var _prescriptionBottleAlt: ImageVector? = null
