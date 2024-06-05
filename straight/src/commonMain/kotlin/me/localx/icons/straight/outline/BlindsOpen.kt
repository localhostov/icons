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

public val Icons.Outline.BlindsOpen: ImageVector
    get() {
        if (_blindsOpen != null) {
            return _blindsOpen!!
        }
        _blindsOpen = Builder(name = "BlindsOpen", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 7.0f)
                lineTo(0.0f, 7.0f)
                verticalLineToRelative(-2.0f)
                lineTo(18.0f, 5.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(18.0f, 10.0f)
                lineTo(0.0f, 10.0f)
                verticalLineToRelative(2.0f)
                lineTo(18.0f, 12.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(18.0f, 15.0f)
                lineTo(0.0f, 15.0f)
                verticalLineToRelative(2.0f)
                lineTo(18.0f, 17.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(0.0f, 22.0f)
                lineTo(16.0f, 22.0f)
                verticalLineToRelative(-2.0f)
                lineTo(0.0f, 20.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(24.0f, 21.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.346f, -3.0f, -3.0f)
                curveToRelative(0.0f, -1.304f, 0.836f, -2.415f, 2.0f, -2.828f)
                lineTo(20.0f, 3.0f)
                curveToRelative(0.0f, -0.551f, -0.448f, -1.0f, -1.0f, -1.0f)
                lineTo(0.0f, 2.0f)
                lineTo(0.0f, 0.0f)
                lineTo(19.0f, 0.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(15.172f)
                curveToRelative(1.164f, 0.413f, 2.0f, 1.524f, 2.0f, 2.828f)
                close()
                moveTo(22.0f, 21.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _blindsOpen!!
    }

private var _blindsOpen: ImageVector? = null
