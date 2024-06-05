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

public val Icons.Outline.ComplianceClipboard: ImageVector
    get() {
        if (_complianceClipboard != null) {
            return _complianceClipboard!!
        }
        _complianceClipboard = Builder(name = "ComplianceClipboard", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.63f, 11.706f)
                lineToRelative(-4.13f, -1.37f)
                lineToRelative(-4.13f, 1.37f)
                curveToRelative(-0.819f, 0.272f, -1.37f, 1.034f, -1.37f, 1.896f)
                verticalLineToRelative(3.912f)
                curveToRelative(0.0f, 3.568f, 3.714f, 5.703f, 4.853f, 6.272f)
                lineToRelative(0.604f, 0.302f)
                lineToRelative(0.627f, -0.252f)
                curveToRelative(1.154f, -0.464f, 4.917f, -2.291f, 4.917f, -6.322f)
                verticalLineToRelative(-3.912f)
                curveToRelative(0.0f, -0.862f, -0.551f, -1.624f, -1.37f, -1.896f)
                close()
                moveTo(22.0f, 17.513f)
                curveToRelative(0.0f, 2.582f, -2.424f, 3.925f, -3.455f, 4.378f)
                curveToRelative(-0.916f, -0.491f, -3.545f, -2.099f, -3.545f, -4.378f)
                verticalLineToRelative(-3.909f)
                reflectiveCurveToRelative(3.5f, -1.161f, 3.5f, -1.161f)
                lineToRelative(3.5f, 1.158f)
                verticalLineToRelative(3.912f)
                close()
                moveTo(14.0f, 9.0f)
                lineTo(4.0f, 9.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(11.0f, 13.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(4.0f, 15.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(14.51f, 24.0f)
                lineTo(3.0f, 24.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                lineTo(0.0f, 2.0f)
                horizontalLineToRelative(5.171f)
                curveToRelative(0.413f, -1.164f, 1.525f, -2.0f, 2.829f, -2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.304f, 0.0f, 2.416f, 0.836f, 2.829f, 2.0f)
                horizontalLineToRelative(5.171f)
                verticalLineToRelative(6.395f)
                lineToRelative(-2.0f, 0.663f)
                verticalLineToRelative(-5.058f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.551f, -0.449f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.449f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                lineTo(2.0f, 4.0f)
                verticalLineToRelative(17.0f)
                curveToRelative(0.0f, 0.551f, 0.449f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(9.554f)
                curveToRelative(0.591f, 0.794f, 1.283f, 1.46f, 1.956f, 2.0f)
                close()
            }
        }
        .build()
        return _complianceClipboard!!
    }

private var _complianceClipboard: ImageVector? = null
